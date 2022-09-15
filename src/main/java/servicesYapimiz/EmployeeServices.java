package servicesYapimiz;

import dtoYapimiz.EmployeeEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface EmployeeServices {

    public List<EmployeeEntity> getAllEmployees(); // dto'dan gelen bu
    public EmployeeEntity createEmployee(EmployeeEntity employeeEntity);

    public ResponseEntity<EmployeeEntity>  getEmployeeById(Long id);  //service yapılarımızı yazarken

    public ResponseEntity<EmployeeEntity>  updateEmployee(Long id,EmployeeEntity employeeEntity);

    public ResponseEntity<Map<String,Boolean>> deleteEmployee(Long id);

    //modelMapper

    public EmployeeEntity entityToDto(EmployeeEntity employeeEntity);
    public EmployeeEntity dtoToEntity(entityYapimiz.EmployeeEntity employeeEntity);
 }
