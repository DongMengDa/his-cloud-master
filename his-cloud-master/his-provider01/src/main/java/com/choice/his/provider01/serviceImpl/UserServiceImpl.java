package com.choice.his.provider01.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.choice.his.pojo.TbUser;
import com.choice.his.provider01.dao.TbUserMapper;
import com.choice.his.provider01.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<TbUserMapper, TbUser> implements UserService {
    @Resource
    private TbUserMapper userMapper;
    //查询所有用户
   public List<TbUser> getList(){

   	return  userMapper.selectList();

   }

	public TbUser queryUserAndStore(Integer userNo) {

		TbUser queryUserAndStore = userMapper.queryUserAndStore(userNo);
		return queryUserAndStore;
	}
}
