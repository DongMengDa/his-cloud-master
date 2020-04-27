package com.choice.his.provider02.controller;

import com.choice.his.pojo.TbStore;
import com.choice.his.provider02.serviceImpl.StoreServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/store")
public class StoreControler {

	@Resource
	private StoreServiceImpl storeServiceImpl;
	
	@GetMapping("/list")
	public List<TbStore> getAllStore(){
		
		List<TbStore> allStore = storeServiceImpl.getAllStore();
		return allStore;
		
	}
	//模糊查询数据
	//新增数据
	//修改数据
	//删除数据

	@GetMapping("get/{id}")
	public ResponseEntity<TbStore> get(@PathVariable("id") Long id ){
		return ResponseEntity.ok(storeServiceImpl.get(id));

	}
}
