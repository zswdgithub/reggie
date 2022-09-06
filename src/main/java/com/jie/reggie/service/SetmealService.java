package com.jie.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jie.reggie.dto.SetmealDto;
import com.jie.reggie.pojo.Setmeal;

import java.util.List;

/**
 * @author mj123
 * @version 1.0
 * @date 2022/9/2 19:12:55
 */
public interface SetmealService extends IService<Setmeal> {
    /**
     * 新增套餐，同时保存套餐和菜品的关联关系
     * @param setmealDto
     */
    public void saveWithDish(SetmealDto setmealDto);

    /**
     * 删除套餐，同时需要删除套餐和菜品的关联数据
     * @param ids
     */
    public void removeWithDish(List<Long> ids);
}
