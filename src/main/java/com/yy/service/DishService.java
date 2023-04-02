package com.yy.service;

import com.yy.dto.DishDto;
import com.yy.entity.Dish;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DishService {
    List<Dish> getDishList();

    int changeStatus(DishDto dishDto);

    int updateDish(Dish dish);

    int logicDelById(Long id);

    Dish getDishById(Long id);
}
