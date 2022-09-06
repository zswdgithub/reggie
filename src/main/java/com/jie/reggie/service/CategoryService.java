package com.jie.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jie.reggie.pojo.Category;

/**
 * @author mj123
 * @version 1.0
 * @date 2022/9/2 17:11:28
 */
public interface CategoryService extends IService<Category> {
    public void remove(Long id);
}
