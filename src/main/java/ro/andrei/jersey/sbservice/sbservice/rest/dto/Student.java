package ro.andrei.jersey.sbservice.sbservice.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Student {
    private Integer id;
    private String name;
    private String location;
    private Address address;
}
