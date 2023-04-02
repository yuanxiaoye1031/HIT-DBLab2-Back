package com.yy.service.impl;

import com.yy.dto.DishDto;
import com.yy.dto.SetmealDto;
import com.yy.entity.Setmeal;
import com.yy.mapper.SetmealMapper;
import com.yy.service.SetmealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SetmealServiceImpl implements SetmealService {

    @Autowired
    private SetmealMapper setmealMapper;

    @Override
    public List<SetmealDto> getSetMealList() {
        return setmealMapper.getSetMealList();
    }

    @Override
    public List<DishDto> getDishListById(Long id) {
        return setmealMapper.getDishListById(id);
    }
}
