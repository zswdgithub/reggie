package com.jie.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jie.reggie.pojo.Dish;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author mj123
 * @version 1.0
 * @date 2022/9/2 19:11:13
 */
@Mapper
public interface DishMapper extends BaseMapper<Dish> {
}
