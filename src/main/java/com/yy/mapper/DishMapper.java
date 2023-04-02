package com.yy.mapper;

import com.yy.dto.DishDto;
import com.yy.entity.Dish;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DishMapper {
    List<Dish> getDishLst();

    int changeStatus(DishDto dishDto);

    int updateDish(Dish dish);

    int logicDelById(Long id);

    Dish getDishById(Long id);

}
