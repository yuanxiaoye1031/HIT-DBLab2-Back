package com.yy.dto;

import lombok.Data;

@Data
public class CategoryWithNum {
    private Long id;
    private String category_name;
    private int num;
}
