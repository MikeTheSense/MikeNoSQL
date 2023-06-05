package com.example.MikeNoSQL.controller.redisController;
import com.example.MikeNoSQL.controller.Controller;
import com.example.MikeNoSQL.crudServiceImpl.CrudRedisServiceImpl;
import com.example.MikeNoSQL.model.redisModel.RedisDepartment;
import com.example.MikeNoSQL.model.redisModel.RedisEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("redis")
public class RedisController implements Controller<RedisEmployee, RedisDepartment> {

    @Autowired
    private CrudRedisServiceImpl crudRedisService;

    @PostMapping("/employee/create")
    @Override
    public String saveEmployee(@RequestBody RedisEmployee emp) {
        return crudRedisService.saveEmployee(emp);
    }

    @PostMapping("/employee/bulkcreate")
    @Override
    public String bulkSaveEmployee(@RequestBody List<RedisEmployee> emp) {
        return crudRedisService.bulkSaveEmployee(emp);
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
        return crudRedisService.deleteEmployee(parsedId);
    }

    @PostMapping("/employee/update")
    @Override
    public String updateEmployee() {
        return crudRedisService.updateEmployee();
    }

    @PostMapping("/employee/get")
    @Override
    public RedisEmployee getEmployee(@RequestParam String id) {
        int parsedId=0;
        try {
            parsedId = Integer.parseInt(id);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        if (parsedId == 0) return null;
        return crudRedisService.getEmployee(parsedId);
    }
    @PostMapping("/department/save")
    @Override
    public String saveDepartment(@RequestBody RedisDepartment department) {
        return crudRedisService.saveDepartment(department);
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
        return crudRedisService.deleteDepartment(parsedId);
    }

    @GetMapping("/department/update")
    @Override
    public String updateDepartment() {
        return crudRedisService.updateDepartment();
    }

    @GetMapping("/employee/getall")
    @Override
    public List<RedisEmployee> findAllEmployees() {
        return crudRedisService.findAllEmployees();
    }

    @GetMapping("/department/getall")
    @Override
    public List<RedisDepartment> findAllDepartments() {
        return crudRedisService.findAllDepartments();
    }
}
