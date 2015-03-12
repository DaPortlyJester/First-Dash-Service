package org.technojays.first.inject;

import com.google.inject.*;
import com.google.inject.name.Names;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.technojays.first.dao.EventDAO;
import org.technojays.first.dao.MatchDAO;
import org.technojays.first.dao.TeamDAO;
import org.technojays.first.service.H4MatchService;
import org.technojays.first.service.H4TeamService;
import org.technojays.first.service.MatchService;
import org.technojays.first.service.TeamService;
import org.technojays.first.util.FDC;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Derelle.Redmond
 * @since 2/1/2015.
 * <p/>
 * Guice Configuration / Injection for Hibernate for Service
 */
public class DashGuiceH4Module implements Module {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    // Thread Local here for one entity
    private static final ThreadLocal<EntityManager> ENTITY_MANAGER_CACHE = new ThreadLocal<>();

    private static Properties h4Properties;

    @Override
    public void configure(Binder binder) {
        String configFile = System.getProperty(FDC.DASH_H4_CONFIG_FILE);

        if (configFile != null && !configFile.isEmpty()) {
            logger.debug("Using H4 config file {}.", configFile);
            h4Properties = new Properties();
            try {
                h4Properties.load(new FileReader(configFile));
            } catch (IOException e) {
                logger.error("Failed to read specified H4 properties file {}", configFile, e);
                throw new RuntimeException("Unable to read specified H4 dash.config.file", e);
            }
        } else {
            logger.debug("Configuring using environment properties");
            h4Properties.setProperty(FDC.H4_DRIVER, System.getProperty(FDC.H4_DRIVER));
            h4Properties.setProperty(FDC.H4_URL, System.getProperty(FDC.H4_URL));
            h4Properties.setProperty(FDC.H4_USER, System.getProperty(FDC.H4_USER));
            h4Properties.setProperty(FDC.H4_PASS, System.getProperty(FDC.H4_PASS));
            h4Properties.setProperty(FDC.H4_POOL_SIZE, System.getProperty(FDC.H4_POOL_SIZE));
            h4Properties.setProperty(FDC.H4_DIALECT, System.getProperty(FDC.H4_DIALECT));
            h4Properties.setProperty(FDC.H4_DDL_AUTO, System.getProperty(FDC.H4_DDL_AUTO));
        }
        Names.bindProperties(binder, h4Properties);

        binder.bind(TeamService.class).to(H4TeamService.class).in(Singleton.class);
        binder.bind(MatchService.class).to(H4MatchService.class).in(Singleton.class);
        binder.bind(TeamDAO.class).asEagerSingleton();
        binder.bind(MatchDAO.class).asEagerSingleton();
        binder.bind(EventDAO.class).asEagerSingleton();
    }

    @Provides
    @Inject
    public EntityManagerFactory entityManagerFactory() {
        return Persistence.createEntityManagerFactory(FDC.H4_MANAGER, h4Properties);
    }

    @Provides
    @Inject
    public EntityManager provideEntityManager(EntityManagerFactory entityManagerFactory) {
        EntityManager entityManager = ENTITY_MANAGER_CACHE.get();
        if (entityManager == null) {
            ENTITY_MANAGER_CACHE.set(entityManager = entityManagerFactory.createEntityManager());
        }
        return entityManager;
    }


}
