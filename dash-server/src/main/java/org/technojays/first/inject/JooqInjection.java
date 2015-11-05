package org.technojays.first.inject;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.jooq.Configuration;
import org.jooq.SQLDialect;
import org.jooq.impl.DefaultConfiguration;

import javax.inject.Inject;
import javax.inject.Named;
import javax.sql.DataSource;
import java.util.Properties;

/**
 * @author Derelle.Redmond
 * @since 11/4/2015
 */
public class JooqInjection extends AbstractModule {

    private static DataSource DATA_SOURCE;

    @Override
    protected void configure() {
    }

    @Provides
    @Singleton
    @Inject
    DataSource provideDataSource(@Named("DSProps") Properties properties) {
        HikariConfig hikariConfig = new HikariConfig(properties);
        HikariDataSource hikariDataSource = new HikariDataSource(hikariConfig);
        DATA_SOURCE = hikariDataSource;
        return hikariDataSource;
    }

    @Provides
    @Singleton
    @Inject
    Configuration provideConfiguration(DataSource dataSource) {
        Configuration configuration = new DefaultConfiguration()
                .set(dataSource)
                .set(SQLDialect.POSTGRES_9_4);
        return configuration;
    }

}
