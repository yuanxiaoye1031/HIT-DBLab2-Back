package com.yy.controller;
import com.yy.entity.Address;
import com.yy.entity.User;
import com.yy.service.UserService;
import com.yy.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public R addUser(@RequestBody User user){
        System.out.println("user内容"+user);
        User tmp_user = userService.getByCardNo(user.getCardno());
        if(tmp_user!=null) return R.error("用户已存在!");
        int i=userService.addUser(user);
        if(i==1) return R.success("添加成功!");
        else return R.error("添加失败!");
    }

    @GetMapping("/userList")
    public R getUserList(){
        List<User> users = userService.getAll();
        return R.success(users);
    }

    @GetMapping
    public R getByName(String name){
        System.out.println("name为"+name);
        List<User> users = userService.likeByName(name);
        if(users!=null)  {
            return R.success(users);
        }
        else return R.error("failed");
    }

    @PostMapping("/addAddress")
    public R addAddress(@RequestBody Address address){
        System.out.println(address);
        // 先查ID是否存在
        User user = userService.getById(address.getUser_id());
        if(user==null) return R.error("用户ID不存在");

        // 先查询该用户的所有地址
        List<Address> addressList = userService.getAddressListByUserId(address.getUser_id());
        for(Address addr : addressList){
            if(addr.contentEqual(address)) return R.error("该地址已存在!");
        }
        int i = userService.addAddress(address);
        System.out.println("i="+i);
        if(i==1) return R.success("添加成功!");
        else return R.error("添加失败!");
    }

    @GetMapping("/getAddressList")
    public R getAddressList(String name){
        if(name==null){
            return R.success(userService.getAddressList());
        }
        else{
            User user = userService.getByName(name);
            return R.success(userService.getAddressListByUserId(user.getId()));
        }
    }
}
