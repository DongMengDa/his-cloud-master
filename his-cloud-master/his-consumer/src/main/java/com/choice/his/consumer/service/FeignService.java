package com.choice.his.consumer.service;

import com.choice.his.consumer.fallback.TestFallBack;
import com.choice.his.pojo.TbStore;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(value = "blackbox-service",fallbackFactory = TestFallBack.class)//不区分大小写
public interface FeignService {

    @GetMapping(value = "/store/list")
    public List<TbStore> getAllStore();

    //	根据ID获取单条数据
    @GetMapping(value = "/store/getById/{id}")
    public TbStore queryStoreById(@PathVariable("id")Long id );
}
