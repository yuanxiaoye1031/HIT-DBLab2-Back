package com.yy.mapper;

import com.yy.dto.CategoryWithNum;
import com.yy.entity.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryMapper {
    List<Category> getDishCategoryList();

    List<CategoryWithNum> getCategoryWithNum();
}
