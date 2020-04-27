package com.choice.his.provider02.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.choice.his.pojo.TbUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbUserMapper extends BaseMapper<TbUser> {


	//根据用户编号查询店铺信息
	public TbUser queryUserAndStore(@Param("userNo") Integer userNo);

	public List<TbUser> selectList();
}