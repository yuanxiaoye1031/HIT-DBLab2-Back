package com.yy.service.impl;

import com.yy.dto.DishDto;
import com.yy.entity.Dish;
import com.yy.mapper.DishMapper;
import com.yy.service.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DishServiceImpl implements DishService {

    @Autowired
    private DishMapper dishMapper;

    @Override
    public List<Dish> getDishList() {
        return dishMapper.getDishLst();
    }

    @Override
    public int changeStatus(DishDto dishDto) {
        return dishMapper.changeStatus(dishDto);
    }

    @Override
    public int updateDish(Dish dish) {
        return dishMapper.updateDish(dish);
    }

    @Override
    public int logicDelById(Long id) {
        return dishMapper.logicDelById(id);
    }

    @Override
    public Dish getDishById(Long id) {
        return dishMapper.getDishById(id);
    }
}
