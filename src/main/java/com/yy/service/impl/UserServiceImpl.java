package com.yy.service.impl;

import com.yy.entity.Address;
import com.yy.entity.User;
import com.yy.mapper.UserMapper;
import com.yy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public List<User> getAll() {
        return userMapper.getAll();
    }

    @Override
    public User getByName(String name) {
        return userMapper.getByName(name);
    }

    @Override
    public User getByCardNo(String cardno) {
        return userMapper.getByCardNo(cardno);
    }

    @Override
    public List<User> likeByName(String name) {
        return userMapper.likeByName(name);
    }

    @Override
    public int addAddress(Address address) {
        return userMapper.addAddress(address);
    }

    @Override
    public List<Address> getAddressListByUserId(Long user_id) {
        return userMapper.getAddressListByUserId(user_id);
    }

    @Override
    public List<Address> getAddressList() {
        return userMapper.getAddressList();
    }

    @Override
    public User getById(Long id) {
        return userMapper.getById(id);
    }
}
