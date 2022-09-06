package com.jie.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jie.reggie.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author mj123
 * @version 1.0
 * @date 2022/8/25 14:49:49
 */
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}
