package com.yy.entity;

import lombok.Data;

@Data
public class Category {
    private Long id;
    private String category_name;
    private int type;
    private int is_deleted;
}
