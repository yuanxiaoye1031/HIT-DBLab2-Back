package com.yy.dto;

import com.yy.entity.Dish;
import lombok.Data;

@Data
public class DishDto extends Dish {
    private String category_name;
    private int number;
}
