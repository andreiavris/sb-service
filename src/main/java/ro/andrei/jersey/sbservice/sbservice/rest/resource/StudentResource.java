package ro.andrei.jersey.sbservice.sbservice.rest.resource;

import java.util.Arrays;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import ro.andrei.jersey.sbservice.sbservice.rest.dto.Student;

@Path("/rest/student")
public class StudentResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Student> getAll() {
        return Arrays.asList(Student.builder().id(1l).location("Brasov").name("Andrei").build());
    }

}
