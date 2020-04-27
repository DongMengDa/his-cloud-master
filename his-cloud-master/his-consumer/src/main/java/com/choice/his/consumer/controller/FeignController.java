package com.choice.his.consumer.controller;

import com.choice.his.consumer.service.FeignService;
import com.choice.his.pojo.TbStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/store")
public class FeignController {

    @Autowired
    private RestTemplate temp;

    @Resource
    private FeignService feignService;

    @RequestMapping("/list")
    public List<TbStore> getAllStore(){

        String url = "http://choice-service/store/list";

        List<TbStore> list = temp.getForObject(url, List.class);
        System.out.println("-----------------走RestTemplate接口---------------------");
        return list;

    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<TbStore> queryStoreById(@PathVariable("id")Long id ){

        TbStore queryStoreById = feignService.queryStoreById(id);

        System.out.println("-----------------走feign接口---------------------");
        return  ResponseEntity.ok(queryStoreById);
    }
}
