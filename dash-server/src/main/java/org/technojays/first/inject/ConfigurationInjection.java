package org.technojays.first.inject;

import com.google.common.base.Strings;
import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.google.inject.name.Named;
import com.google.inject.name.Names;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
public class ConfigurationInjection implements Module {

    Properties appProperties;
//    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void configure(Binder binder) {
        String configFile = getConfigFile();

       appProperties = getAppProperties();

        /**
         * Uncomment to see loaded environment properties - All properties are loaded from environment on Heroku
         * See system.properties file for more information
         */
        appProperties.forEach((key, value) -> log.debug("Property: {} - {}", key, appProperties.getProperty((String) key)));
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
        props.setProperty(FDC.DATASOURCE_CLASS_NAME, "org.postgresql.ds.PGSimpleDataSource");
        props.setProperty(FDC.DATASOURCE_DATABASENAME, appProperties.getProperty(FDC.DATASOURCE_DATABASENAME));
        //props.put("dataSource.logWriter", new PrintWriter(System.out));
        return props;
    }

    /**
     * Get config file name / path
     * Used to specify configuration when developed locally
     * For Heroku deployment, properties are managed through environment
     *
     * @return config file to use
     */
    public String getConfigFile() {
        return System.getProperty(FDC.DASH_CONFIG_FILE) == null ?
                FDC.DEFAULT_DASH_CONFIG_FILE : System.getProperty(FDC.DASH_CONFIG_FILE);
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

    /**
     * Get application properties
     *
     * Gets properties from config file if present, otherwise retrieves from system properties
     * @return application properties for configuration
     */
    private Properties getAppProperties() {
        String configFile = getConfigFile();

        if (useConfigFile(configFile)) {
            log.debug("Using config file {}.", configFile);
            return getPropertiesFromFile(configFile);
        }

        log.debug("Configuring using environment properties");
        return System.getProperties();

    }

    /**
     * Retrieve application properties from file
     *
     * @param configFile File to read from
     * @return application properties read from file
     */
    private Properties getPropertiesFromFile(String configFile) {
        Properties configProperties = new Properties();
        try {
            configProperties.load(new FileReader(configFile));
        } catch (IOException e) {
            log.error("Failed to read specified properties file {}", configFile, e);
            throw new RuntimeException("Unable to read specified dash.config.file", e);
        }
        return configProperties;
    }
}
