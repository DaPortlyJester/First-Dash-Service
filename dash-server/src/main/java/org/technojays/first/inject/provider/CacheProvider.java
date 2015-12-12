package org.technojays.first.inject.provider;

import org.technojays.first.inject.annotation.CacheAnnotations.*;
import org.technojays.first.rest.filter.CacheResponseFilter;

import javax.ws.rs.container.DynamicFeature;
import javax.ws.rs.container.ResourceInfo;
import javax.ws.rs.core.FeatureContext;
import javax.ws.rs.ext.Provider;
import java.lang.reflect.Method;

/**
 * @author Derelle.Redmond
 * @since 12/12/2015
 */
@Provider
public class CacheProvider implements DynamicFeature {

    private final CacheResponseFilter NO_CACHE_FILTER =
            new CacheResponseFilter("no-cache");

    @Override
    public void configure(ResourceInfo resourceInfo, FeatureContext context) {
        registerCacheFilter(resourceInfo.getResourceMethod(), context);
    }

    private void registerCacheFilter(Method method, FeatureContext context) {
        if(method.isAnnotationPresent(NoCache.class)){
            context.register(NO_CACHE_FILTER);
            return;
        }

        if (method.isAnnotationPresent(CacheMaxAge.class)) {
            CacheMaxAge maxAge = method.getAnnotation(CacheMaxAge.class);
            context.register(new CacheResponseFilter("max-age= " + maxAge.unit().toSeconds(maxAge.time())));
        } else{
            context.register(NO_CACHE_FILTER);
        }
    }

    private CacheResponseFilter getResourceCacheAnnotation() {

        return null;
    }
}
