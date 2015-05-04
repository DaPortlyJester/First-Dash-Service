package org.technojays.first.inject;

import com.google.inject.Inject;
import com.google.inject.persist.PersistService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author DaPortlyJester
 * @since 5/3/2015
 *
 * Initialization class for Guice persistence
 */
public class PersistenceInit {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    PersistService persistService;

    @Inject
    public PersistenceInit(PersistService service) {
        logger.info("Starting persistence service");
        service.start();
    }

    public PersistenceInit(){
        logger.info("Starting persistence service - Empty Constructor");
        persistService.start();
    }

}
