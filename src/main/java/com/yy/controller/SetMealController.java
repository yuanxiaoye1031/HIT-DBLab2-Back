package com.yy.controller;

import com.yy.dto.DishDto;
import com.yy.dto.SetmealDto;
import com.yy.entity.Dish;
import com.yy.service.SetmealService;
import com.yy.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/setmeal")
public class SetMealController {

    @Autowired
    private SetmealService setmealService;

    @GetMapping("/list")
    public R getSetMealList(){
        List<SetmealDto> setmealDtoList = setmealService.getSetMealList();
        for(SetmealDto setmealDto:setmealDtoList){
            setmealDto.setDishList(setmealService.getDishListById(setmealDto.getId()));
        }
        return R.success(setmealDtoList);
    }

}
