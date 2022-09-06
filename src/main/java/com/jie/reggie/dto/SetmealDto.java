package com.jie.reggie.dto;

import com.jie.reggie.pojo.Setmeal;
import com.jie.reggie.pojo.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
