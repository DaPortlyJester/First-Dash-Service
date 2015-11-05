package org.technojays.first.inject;

import com.google.common.base.Strings;
import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.google.inject.name.Named;
import com.google.inject.name.Names;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.technojays.first.util.FDC;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Properties;

/**
 * @author DaPortlyJester
 * @since 1/18/2015
 * <p>
 * Configure application properties from local file specified in dash.config.file system property or
 * based on configured environment properties
 */
public class ConfigurationInjection implements Module {

    Properties appProperties;
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void configure(Binder binder) {
        String configFile = getConfigFile();

        if (useConfigFile(configFile)) {
            logger.debug("Using config file {}.", configFile);
            appProperties = getPropertiesFromFile(configFile);
        } else {
            logger.debug("Configuring using environment properties");
            appProperties = System.getProperties();
        }

        /**
         * Uncomment to see loaded environment properties - All properties are loaded from environment on Heroku
         * See system.properties file for more information
         */
        for (String propertyName : appProperties.stringPropertyNames()) {
            logger.debug("Property: {} - {}", propertyName, appProperties.getProperty(propertyName));
        }
        // binds properties for Guice
        Names.bindProperties(binder, appProperties);
    }

    @Provides
    @Singleton
    @Named("DSProps")
    public Properties getDataSourceProperties() {
        Properties props = new Properties();
        props.setProperty(FDC.DATASOURCE_JDBC_URL, appProperties.getProperty(FDC.DATABASE_URL));
        props.setProperty(FDC.DATASOURCE_USER, appProperties.getProperty(FDC.DATASOURCE_USER));
        props.setProperty(FDC.DATASOURCE_PASSWORD, appProperties.getProperty(FDC.DATASOURCE_PASSWORD));
        //props.setProperty("dataSourceClassName", "org.postgresql.ds.PGSimpleDataSource");
        //props.setProperty("dataSource.databaseName", "mydb");
        //props.put("dataSource.logWriter", new PrintWriter(System.out));
        return props;
    }

    /**
     * Get config file name / path
     * Used to specify configuration when developed locally
     * For Heroku deployment, properties are managed through environment
     *
     * @return
     */
    public String getConfigFile() {
        return System.getProperty(FDC.DASH_CONFIG_FILE);
    }

    /**
     * Use a file based configuration
     *
     * @param configFile path to file
     * @return True if should use the file, false otherwise
     */
    public boolean useConfigFile(String configFile) {
        return Strings.isNullOrEmpty(configFile) ? false : Paths.get(configFile).toFile().exists();
    }


    private Properties getPropertiesFromFile(String configFile) {
        Properties configProperties = new Properties();
        try {
            configProperties.load(new FileReader(configFile));
        } catch (IOException e) {
            logger.error("Failed to read specified properties file {}", configFile, e);
            throw new RuntimeException("Unable to read specified dash.config.file", e);
        }
        return configProperties;
    }
}
