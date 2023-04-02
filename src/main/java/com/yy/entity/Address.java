package com.yy.entity;

import lombok.Data;
import org.springframework.util.StringUtils;

@Data
public class Address {
    private Long id;
    private Long user_id;
    private String name;
    private String phone;
    private String detail;
    private int is_deleted;

    public boolean contentEqual(Address a){
        return this.user_id==a.user_id && this.name.equals(a.name) && this.phone.equals(a.phone) && this.detail.equals(a.detail);
    }
}
