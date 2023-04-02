package com.yy.mapper;

import com.yy.dto.DishDto;
import com.yy.dto.SetmealDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SetmealMapper {
    List<SetmealDto> getSetMealList();

    List<DishDto> getDishListById(Long id);
}
