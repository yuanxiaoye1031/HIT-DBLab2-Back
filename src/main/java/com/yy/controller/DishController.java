package com.yy.controller;

import com.yy.dto.DishDto;
import com.yy.entity.Dish;
import com.yy.entity.SetmealDish;
import com.yy.service.DishService;
import com.yy.service.SetmealDishService;
import com.yy.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dish")
public class DishController {

    @Autowired
    private DishService dishService;

    @Autowired
    private SetmealDishService setmealDishService;

    @GetMapping("/getDishList")
    public R getDishList(){
        return R.success(dishService.getDishList());
    }

    @PostMapping("/changeStatus")
    public R changeStatus(@RequestBody DishDto dishDto){
        int i = dishService.changeStatus(dishDto);
        System.out.println("i="+i);
        if(i==1) return R.success("修改成功");
        else return R.error("修改失败");
    }

    @PostMapping("/update")
    public R updateDish(@RequestBody Dish dish ){
//        System.out.println(dish);
        int i = dishService.updateDish(dish);
        if(i==1) return R.success("修改成功");
        else return R.error("修改失败");
    }

    @DeleteMapping("/logicDel")
    public R logicDelById(Long id){
        System.out.println("id="+id);
        List<SetmealDish> dishList = setmealDishService.getSetmealDishByDishId(id);
        if(dishList.size()!=0) return R.error("该菜品关联了套餐，删除失败!");
        else {
            int i = dishService.logicDelById(id);
            if(i==1) return R.success("删除成功");
            else return R.error("删除失败");
        }
    }
}
