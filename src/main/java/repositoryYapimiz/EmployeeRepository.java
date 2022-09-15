package repositoryYapimiz;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//kodlama yaparken JPA yapımız hibernate için lazım
//JpaRepository >> CrudRepository


@Repository
public interface EmployeeRepository extends CrudRepository {



}
