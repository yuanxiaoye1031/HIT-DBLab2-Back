package com.yy.service;

import com.yy.dto.CategoryWithNum;
import com.yy.entity.Category;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryService {
    List<Category> getDishCategoryList();

    List<CategoryWithNum> getCategoryWithNum();
}
