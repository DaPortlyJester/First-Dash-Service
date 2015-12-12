package org.technojays.first.rest.filter;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.core.HttpHeaders;
import java.io.IOException;

/**
 * @author Derelle.Redmond
 * @since 12/12/2015
 */
public class CacheResponseFilter implements ContainerResponseFilter {
    private final String headerValue;

    public CacheResponseFilter(String headerValue){
        this.headerValue = headerValue;
    }

    @Override
    public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext)
            throws IOException {
        responseContext.getHeaders().putSingle(HttpHeaders.CACHE_CONTROL, headerValue);
    }
}
