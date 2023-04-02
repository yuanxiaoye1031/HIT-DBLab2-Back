package com.yy.controller;

import com.yy.service.CategoryService;
import com.yy.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/dishList")
    public R getDishCategoryList(){
        return R.success(categoryService.getDishCategoryList());
    }

    @GetMapping("/categoryWithNum")
    public R categoryWithNum(){
        return R.success(categoryService.getCategoryWithNum());
    }
}
