package ro.andrei.jersey.sbservice.sbservice.rest.resource;

import java.util.List;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import ro.andrei.jersey.sbservice.sbservice.rest.dto.Student;
import ro.andrei.jersey.sbservice.sbservice.service.StudentService;

@Path("/rest/student")
public class StudentResource {

    @Autowired
    private StudentService studentService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Student> getAll() {
        return studentService.getAll();
    }

    @GET
    @Path("/{id}")
    public Student getById(@PathParam("id") Integer id) {
        return studentService.getById(id);
    }

    @DELETE
    @Path("/{id}")
    public Response deleteById(@PathParam("id") Integer id) {
        studentService.remove(id);
        return Response.ok().build();
    }

    @POST
    public Response create(Student student) {
        studentService.create(student);
        return Response.ok().build();
    }
}
