package com.choice.his.provider01.service;

import com.choice.his.pojo.TbUser;

import java.util.List;

public interface UserService {
    //获取list数据
    public List<TbUser> getList();
    //多表联查
    public TbUser queryUserAndStore(Integer userNo);
}
