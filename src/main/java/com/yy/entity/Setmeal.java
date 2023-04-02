package com.yy.entity;

import lombok.Data;

@Data
public class Setmeal {
    private Long id;
    private Long category_id;
    private String setmeal_name;
    private Double price;
    private String description;
    private int status;
    private int is_deleted;
}
