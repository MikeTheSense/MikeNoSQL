package com.example.MikeNoSQL.controller.cassandraController;

import com.example.MikeNoSQL.controller.Controller;
import com.example.MikeNoSQL.crudServiceImpl.CrudCassandraServiceImpl;
import com.example.MikeNoSQL.model.cassandraModel.CassandraDepartment;
import com.example.MikeNoSQL.model.cassandraModel.CassandraEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cassandra")
public class CassandraController implements Controller<CassandraEmployee, CassandraDepartment> {
    @Autowired
    private CrudCassandraServiceImpl crudCassandraService;
    
    
    @PostMapping("/employee/create")
    @Override
    public String saveEmployee(@RequestBody CassandraEmployee emp) {
        return crudCassandraService.saveEmployee(emp);
    }

    @PostMapping("/employee/bulkcreate")
    @Override
    public String bulkSaveEmployee(@RequestBody List<CassandraEmployee> emp) {
        return crudCassandraService.bulkSaveEmployee(emp);
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
        return crudCassandraService.deleteEmployee(parsedId);
    }

    @PostMapping("/employee/update")
    @Override
    public String updateEmployee() {
        return crudCassandraService.updateEmployee();
    }

    @PostMapping("/employee/get")
    @Override
    public CassandraEmployee getEmployee(@RequestParam String id) {
        int parsedId=0;
        try {
            parsedId = Integer.parseInt(id);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        if (parsedId == 0) return null;
        return crudCassandraService.getEmployee(parsedId);
    }
    @PostMapping("/department/save")
    @Override
    public String saveDepartment(@RequestBody CassandraDepartment department) {
        return crudCassandraService.saveDepartment(department);
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
        return crudCassandraService.deleteDepartment(parsedId);
    }

    @GetMapping("/department/update")
    @Override
    public String updateDepartment() {
        return crudCassandraService.updateDepartment();
    }

    @GetMapping("/employee/getall")
    @Override
    public List<CassandraEmployee> findAllEmployees() {
        return crudCassandraService.findAllEmployees();
    }

    @GetMapping("/department/getall")
    @Override
    public List<CassandraDepartment> findAllDepartments() {
        return crudCassandraService.findAllDepartments();
    }
}
