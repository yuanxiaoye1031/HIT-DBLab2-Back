package com.yy.mapper;

import com.yy.entity.SetmealDish;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SetmealDishMapper {
    List<SetmealDish> getSetmealDishByDishId(Long id);
}
