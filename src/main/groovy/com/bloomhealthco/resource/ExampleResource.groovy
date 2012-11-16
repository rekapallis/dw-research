package com.bloomhealthco.resource

import com.example.helloworld.core.Saying
import java.util.concurrent.atomic.AtomicLong
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType
import org.slf4j.Logger
import org.slf4j.LoggerFactory

@Path("/example")
@Produces(MediaType.APPLICATION_JSON)
public class ExampleResource {
    private static final Logger LOGGER = LoggerFactory.getLogger(ExampleResource.class)

    private final AtomicLong counter

    public ExampleResource() {
        this.counter = new AtomicLong();
    }

    @GET
    public String sayHello() {
        return "Hi There!!!"
    }
}
