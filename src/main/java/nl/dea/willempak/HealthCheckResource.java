package nl.dea.willempak;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/health")
public class HealthCheckResource {

    @GET
    public String healthy() {

        return "Up and Running";
    }
}

