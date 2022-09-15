package servicesYapimiz.impl;

import dtoYapimiz.EmployeeEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import repositoryYapimiz.EmployeeRepository;
import servicesYapimiz.EmployeeServices;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service   //servis yapıları için bunu ekliyoruzz ....!!!
public class EmployeeServiceImpl implements EmployeeServices {


    //database ile alakalı işlemleri yapabileceğimiz bir yerimiz olması gerekiyor
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private ModelMapper modelMapper;


    //LIST
    //http:/localhost:8080/api/v1/employees
    @GetMapping("/employees")
    @Override
    public List<EmployeeEntity> getAllEmployees() {
        List<EmployeeEntity> listDto =new ArrayList<>();
        Iterable<EmployeeEntity> entities=employeeRepository.findAll();  //bütün listeyi bana gönder ve iterable a gönder
        for (EmployeeEntity employee:entities){
            EmployeeEntity employee1=entityToDto(employee);
            listDto.add(employee1);
        }
        return null;
    }

    @Override
    public EmployeeEntity createEmployee(EmployeeEntity employeeEntity) {
        return null;
    }


    @GetMapping("/employee/{id}")
    @Override
    public ResponseEntity<EmployeeEntity> getEmployeeById(@PathVariable Long id) {
        return null;
    }

    @Override
    public ResponseEntity<EmployeeEntity> updateEmployee(Long id, EmployeeEntity employeeEntity) {
        return null;
    }

    @Override
    public ResponseEntity<Map<String, Boolean>> deleteEmployee(Long id) {
        return null;
    }


    ////////////////////////////////////////
    //model mapper

    @Override
    public EmployeeEntity entityToDto(EmployeeEntity employeeEntity) {
        EmployeeEntity employeedto =modelMapper.map(employeeEntity,EmployeeEntity.class);
        return employeedto;
    }

    @Override
    public EmployeeEntity dtoToEntity(entityYapimiz.EmployeeEntity employeeEntity) {
        return null;
    }
}
