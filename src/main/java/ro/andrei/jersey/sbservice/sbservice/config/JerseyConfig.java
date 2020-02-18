package ro.andrei.jersey.sbservice.sbservice.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;
import ro.andrei.jersey.sbservice.sbservice.rest.resource.StudentResource;

@Component
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        register(StudentResource.class);
    }
}
