package com.choice.his.provider01.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.choice.his.pojo.TbStore;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbStoreMapper extends BaseMapper<TbStore> {
    //新增
    public int create(TbStore store);
    //删除
    public int deleteById(@Param("id") Long id);
    //修改
    public int updateById(Long id, TbStore tbStore);
    //查询
    public TbStore getById(@Param("id") Long id);
    //多查
    public List<TbStore> selectList();
    //分页查询

}
