package com.yy.entity;

import lombok.Data;

@Data
public class Dish {
    private Long id;
    private String dish_name;
    private Long category_id;
    private Double price;
    private String description;
    private int status;
    private int is_deleted;
}
