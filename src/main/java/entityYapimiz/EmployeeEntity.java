package entityYapimiz;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;


@Data
@NoArgsConstructor
@Builder
@Log4j2

@Entity //bunun database'e eklenmesi ve db ile alakalı işlemler yapabilmemiz için
@Table(name = "employess")

public class EmployeeEntity extends BaseEntity implements Serializable {
//bunlar db'ye saklanacak olan yapılardır

    @Column(name = "firsname")
    private String firstName;

    @Column(name = "lastName")
    private String  lastName;

    @Column(name = "emailId ")
    private String emailId;


    public EmployeeEntity(String firstName, String lastName, String emailId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
    }
}
