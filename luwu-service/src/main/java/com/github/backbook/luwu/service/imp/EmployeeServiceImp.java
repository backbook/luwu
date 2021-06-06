package com.github.backbook.luwu.service.imp;



import com.github.backbook.luwu.dao.mapper.EmployeeMapper;
import com.github.backbook.luwu.model.pojo.Employee;
import com.github.backbook.luwu.service.EmployeeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EmployeeServiceImp implements EmployeeService {

    @Resource
    EmployeeMapper employeeMapper;

    @Override
    public List<Employee> list() {
        List<Employee> employees = employeeMapper.selectList(null);
        return employees;
    }
}
