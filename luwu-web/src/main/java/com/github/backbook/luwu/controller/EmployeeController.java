package com.github.backbook.luwu.controller;


import com.github.backbook.luwu.model.pojo.Employee;
import com.github.backbook.luwu.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/test")
public class EmployeeController {

    @Resource
    EmployeeService userService;

    @GetMapping("/employeeList")
    public  List<Employee> userList(){
        List<Employee> list = userService.list();
        return list;
    }


}
