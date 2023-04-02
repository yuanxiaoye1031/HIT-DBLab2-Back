package com.yy.mapper;

import com.yy.entity.Address;
import com.yy.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    public int addUser(User user);

    public List<User> getAll();

    User getByName(String name);

    User getByCardNo(String cardno);

    List<User> likeByName(String name);

    int addAddress(Address address);

    List<Address> getAddressListByUserId(Long user_id);

    List<Address> getAddressList();

    User getById(Long id);
}
