package com.example.MikeNoSQL.controller.neo4jController;

import com.example.MikeNoSQL.controller.Controller;
import com.example.MikeNoSQL.crudServiceImpl.CrudNeo4jServiceImpl;
import com.example.MikeNoSQL.dataTransferObject.EmployeeDTO;
import com.example.MikeNoSQL.model.neo4jModel.Neo4jDepartment;
import com.example.MikeNoSQL.model.neo4jModel.Neo4jEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("neo4j")
@RestController
public class Neo4jController implements Controller<Neo4jEmployee, Neo4jDepartment> {

    @Autowired
    private CrudNeo4jServiceImpl crudNeo4jService;

    @PostMapping("/employee/create")
    @Override
    public String saveEmployee(@RequestBody Neo4jEmployee emp) {
        return crudNeo4jService.saveEmployee(emp);
    }

    @PostMapping("/employee/bulkcreate")
    @Override
    public String bulkSaveEmployee(@RequestBody List<Neo4jEmployee> emp) {
        return crudNeo4jService.bulkSaveEmployee(emp);
    }

    @PostMapping("/employee/delete")
    @Override
    public String deleteEmployee(@RequestParam String id) {
        int parsedId=0;
        try {
            parsedId = Integer.parseInt(id);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        if (parsedId == 0) return "Wrong id number";
        return crudNeo4jService.deleteEmployee(parsedId);
    }

    @PostMapping("/employee/update")
    @Override
    public String updateEmployee() {
        return crudNeo4jService.updateEmployee();
    }

    @PostMapping("/employee/get")
    @Override
    public Neo4jEmployee getEmployee(@RequestParam String id) {
        int parsedId=0;
        try {
            parsedId = Integer.parseInt(id);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        if (parsedId == 0) return null;
        return crudNeo4jService.getEmployee(parsedId);
    }
    @PostMapping("/employee/getby")
    public EmployeeDTO getEmployeeBy(@RequestParam String id) {
        int parsedId=0;
        try {
            parsedId = Integer.parseInt(id);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        if (parsedId == 0) return null;
        return new EmployeeDTO(crudNeo4jService.getEmployee(parsedId));
    }


    @PostMapping("/department/save")
    @Override
    public String saveDepartment(@RequestBody Neo4jDepartment department) {
        return crudNeo4jService.saveDepartment(department);
    }

    @PostMapping("/department/delete")
    @Override
    public String deleteDepartment(@RequestParam String id) {
        int parsedId=0;
        try {
            parsedId = Integer.parseInt(id);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        if (parsedId == 0) return "Wrong id number";
        return crudNeo4jService.deleteDepartment(parsedId);
    }

    @GetMapping("/department/update")
    @Override
    public String updateDepartment() {
        return crudNeo4jService.updateDepartment();
    }

    @GetMapping("/employee/getall")
    @Override
    public List<Neo4jEmployee> findAllEmployees() {
        return crudNeo4jService.findAllEmployees();
    }

    @GetMapping("/department/getall")
    @Override
    public List<Neo4jDepartment> findAllDepartments() {
        return crudNeo4jService.findAllDepartments();
    }
}
