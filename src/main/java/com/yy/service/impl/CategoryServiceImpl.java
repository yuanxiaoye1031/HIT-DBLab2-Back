package com.yy.service.impl;

import com.yy.dto.CategoryWithNum;
import com.yy.entity.Category;
import com.yy.mapper.CategoryMapper;
import com.yy.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> getDishCategoryList() {
        return categoryMapper.getDishCategoryList();
    }

    @Override
    public List<CategoryWithNum> getCategoryWithNum() {
        return categoryMapper.getCategoryWithNum();
    }
}
