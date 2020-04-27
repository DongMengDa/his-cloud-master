package com.choice.his.provider01.controller;

import com.choice.his.pojo.TbUser;
import com.choice.his.provider01.service.UserService;
import com.choice.his.provider01.serviceImpl.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
	
	@Resource
	private UserServiceImpl userServiceImpl;
	

	Logger logger = LoggerFactory.getLogger(UserController.class);

	@GetMapping("/list")
	public List<TbUser> getUserList(){
		return userServiceImpl.getList();
	}

	//测试多表查询-------------------------------------------------------
	@GetMapping("/testOneToMany")
	public TbUser getAllUser(@RequestParam(value = "userNo") Integer userNo) {
		logger.info("访问到达-----------------");
		TbUser  queryUserAndStore = null;
		try {
			queryUserAndStore = userServiceImpl.queryUserAndStore(userNo);
			queryUserAndStore.setUserNo(userNo.toString());
			
		} catch (Exception e) {
			logger.error(e.toString());
		}
		logger.info(String.valueOf(queryUserAndStore));
		return queryUserAndStore;
	}

}
