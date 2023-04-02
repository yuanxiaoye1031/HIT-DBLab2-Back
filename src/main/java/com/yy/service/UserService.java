package com.yy.service;

import com.yy.entity.Address;
import com.yy.entity.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    int addUser(User user);

    List<User> getAll();

    User getByName(String name);

    User getByCardNo(String cardno);

    List<User> likeByName(String name);

    int addAddress(Address address);

    List<Address> getAddressListByUserId(Long user_id);

    List<Address> getAddressList();

    User getById(Long id);
}
