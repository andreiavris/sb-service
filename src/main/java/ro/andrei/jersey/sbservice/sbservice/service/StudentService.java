package ro.andrei.jersey.sbservice.sbservice.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import javax.ws.rs.NotFoundException;
import org.springframework.stereotype.Service;
import ro.andrei.jersey.sbservice.sbservice.rest.dto.Address;
import ro.andrei.jersey.sbservice.sbservice.rest.dto.Student;

@Service
public class StudentService {

    private static Map<Integer, Student> DB = new HashMap<>();

    static {
        Stream.iterate(1, i -> i + 1).limit(10)
                .forEach(i -> DB.put(i, Student.builder().id(i).name("Name" + i)
                        .location("location" + i)
                        .address(Address.builder()
                                .id(i + 1000)
                                .address("Address" + i)
                                .build())
                        .build()));
    }

    public List<Student> getAll() {
        return new ArrayList<>(DB.values());
    }

    public Student getById(Integer id) {
        if(!DB.containsKey(id)) {
            throw new NotFoundException();
        }
        return DB.get(id);
    }

    public void create(Student student) {
        DB.put(student.getId(), student);
    }

    public void remove(Integer id) {
        DB.remove(id);
    }
}
