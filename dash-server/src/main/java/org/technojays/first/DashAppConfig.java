package org.technojays.first;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.persist.PersistService;
import lombok.extern.slf4j.Slf4j;
import org.glassfish.hk2.api.ServiceLocator;
import org.glassfish.jersey.server.ResourceConfig;
import org.jvnet.hk2.guice.bridge.api.GuiceBridge;
import org.jvnet.hk2.guice.bridge.api.GuiceIntoHK2Bridge;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.technojays.first.inject.*;

import javax.inject.Inject;
import javax.ws.rs.ApplicationPath;

/**
 * @author DaPortlyJester
 * @since 1/17/2015
 *
 * Resource (REST Endpoint) app configuration class to load Guice Configuration
 * through HK2 Guice Bridge. Builds Guice injector from Injection modules and registers packages on the default FIRST
 * Dash REST package path.
 */
@ApplicationPath("api/v1/")
@Slf4j
public class DashAppConfig extends ResourceConfig {

    @Inject
    public DashAppConfig(ServiceLocator serviceLocator) {
        log.info("Registering packages on {}", DashContants.DASH_REST_PACKAGE);
        // Register package for rest endpoints and fasterxml for JSON support
        packages(DashContants.DASH_REST_PACKAGE, DashContants.FASTERXML_PACKAGE, DashContants.DASH_INJECT_PACKAGE);

        log.info("Building Injectors");
        Injector injector = Guice.createInjector(
                new ConfigurationInjection(),
                new JSONInjection(),
                new DashModule(),
                new JooqInjection()
        );

        GuiceBridge.getGuiceBridge().initializeGuiceBridge(serviceLocator);
        GuiceIntoHK2Bridge guiceBridge = serviceLocator.getService(GuiceIntoHK2Bridge.class);
        guiceBridge.bridgeGuiceInjector(injector);
    }

    /**
     * Initialize Persistence Service
     */
    public class PersistentInit {

        @Inject
        PersistentInit(PersistService service) {
            service.start();
        }

        PersistentInit(){}
    }
}
