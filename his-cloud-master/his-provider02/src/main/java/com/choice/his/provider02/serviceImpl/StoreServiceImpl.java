package com.choice.his.provider02.serviceImpl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.choice.his.pojo.TbStore;
import com.choice.his.provider02.dao.TbStoreMapper;
import com.choice.his.provider02.service.StoreService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StoreServiceImpl  extends ServiceImpl<TbStoreMapper, TbStore> implements StoreService {
    @Resource
    private TbStoreMapper storeMapper;

  //获取所有的店铺
    public List<TbStore> getAllStore() {

        List<TbStore> select  = storeMapper.selectList();

        return select;

    }

    public TbStore get(Long id) {

        QueryWrapper<TbStore> wrapper = new QueryWrapper<>();

        wrapper.lambda().eq(TbStore::getId, id);

        return this.getOne(wrapper);

    }

}
