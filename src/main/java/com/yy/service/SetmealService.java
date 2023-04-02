package com.yy.service;

import com.yy.dto.DishDto;
import com.yy.dto.SetmealDto;
import com.yy.entity.Setmeal;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SetmealService {
    List<SetmealDto> getSetMealList();

    List<DishDto> getDishListById(Long id);
}
