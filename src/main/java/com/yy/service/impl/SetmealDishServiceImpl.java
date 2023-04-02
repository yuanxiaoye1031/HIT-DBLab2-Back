package com.yy.service.impl;

import com.yy.entity.SetmealDish;
import com.yy.mapper.SetmealDishMapper;
import com.yy.service.SetmealDishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SetmealDishServiceImpl implements SetmealDishService {

    @Autowired
    private SetmealDishMapper setmealDishMapper;

    @Override
    public List<SetmealDish> getSetmealDishByDishId(Long id) {
        return setmealDishMapper.getSetmealDishByDishId(id);
    }
}
