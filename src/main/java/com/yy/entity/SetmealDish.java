package com.yy.entity;

import lombok.Data;

@Data
public class SetmealDish {
    private Long id;
    private Long setmeal_id;
    private Long dish_id;
    private Double price;
    private int number;
    private int is_deleted;
}
