package com.yy.service;

import com.yy.entity.SetmealDish;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SetmealDishService {
    List<SetmealDish> getSetmealDishByDishId(Long id);
}
