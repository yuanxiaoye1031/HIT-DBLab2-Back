package com.yy.dto;

import com.yy.entity.Setmeal;
import lombok.Data;

import java.util.List;

@Data
public class SetmealDto extends Setmeal {
    private String category_name;
    private List<DishDto> dishList;
}
