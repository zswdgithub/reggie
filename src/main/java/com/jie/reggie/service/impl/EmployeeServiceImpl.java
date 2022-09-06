package com.jie.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jie.reggie.mapper.EmployeeMapper;
import com.jie.reggie.pojo.Employee;
import com.jie.reggie.service.EmployeeService;
import org.springframework.stereotype.Service;

/**
 * @author mj123
 * @version 1.0
 * @date 2022/8/25 14:53:23
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}
