package dtoYapimiz;

//DTO: data tranfer object --> verilerimizi tranfer edeceğimiz zaman

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import javax.validation.constraints.NotEmpty;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Log4j2
public class EmployeeEntity {

    private Long Id;
    private String firstName;
    private String  lastName;
    private String emailId;

}
