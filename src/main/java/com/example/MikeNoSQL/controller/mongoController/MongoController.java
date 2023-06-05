package com.example.MikeNoSQL.controller.mongoController;

import com.example.MikeNoSQL.controller.Controller;
import com.example.MikeNoSQL.crudServiceImpl.CrudMongoServiceImpl;
import com.example.MikeNoSQL.model.mongoModel.MongoDepartment;
import com.example.MikeNoSQL.model.mongoModel.MongoEmployee;
import com.example.MikeNoSQL.repository.mongoRepository.MongoEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("mongo")
public class MongoController implements Controller <MongoEmployee, MongoDepartment> {
    @Autowired
    private CrudMongoServiceImpl crudMongoService;



    @PostMapping("/employee/create")
    @Override
    public String saveEmployee(@RequestBody MongoEmployee emp) {
        return crudMongoService.saveEmployee(emp);
    }

    @PostMapping("/employee/bulkcreate")
    @Override
    public String bulkSaveEmployee(@RequestBody List<MongoEmployee> emp) {
        return crudMongoService.bulkSaveEmployee(emp);
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
        return crudMongoService.deleteEmployee(parsedId);
    }

    @PostMapping("/employee/update")
    @Override
    public String updateEmployee() {
        return crudMongoService.updateEmployee();
    }

    @PostMapping("/employee/get")
    @Override
    public MongoEmployee getEmployee(@RequestParam String id) {
        int parsedId=0;
        try {
            parsedId = Integer.parseInt(id);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        if (parsedId == 0) return null;
        return crudMongoService.getEmployee(parsedId);
    }
    @PostMapping("/department/save")
    @Override
    public String saveDepartment(@RequestBody MongoDepartment department) {
        return crudMongoService.saveDepartment(department);
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
        return crudMongoService.deleteDepartment(parsedId);
    }

    @GetMapping("/department/update")
    @Override
    public String updateDepartment() {
        return crudMongoService.updateDepartment();
    }

    @GetMapping("/employee/getall")
    @Override
    public List<MongoEmployee> findAllEmployees() {
        return crudMongoService.findAllEmployees();
    }

    @GetMapping("/department/getall")
    @Override
    public List<MongoDepartment> findAllDepartments() {
        return crudMongoService.findAllDepartments();
    }
}
