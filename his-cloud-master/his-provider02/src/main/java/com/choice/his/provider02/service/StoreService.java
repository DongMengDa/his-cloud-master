package com.choice.his.provider02.service;

import com.choice.his.pojo.TbStore;

import java.util.List;

public interface StoreService {
    public List<TbStore> getAllStore();
    public TbStore get(Long id);
}
