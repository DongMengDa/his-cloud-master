package com.choice.his.provider01.controller;

import com.choice.his.pojo.TbStore;
import com.choice.his.provider01.service.StoreService;
import com.choice.his.provider01.serviceImpl.StoreServiceImpl;
import org.springframework.beans.factory.annotation.Qualifier;
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

	@GetMapping("getById/{id}")
	public ResponseEntity<TbStore> get(@PathVariable("id") Long id ){
		return ResponseEntity.ok(storeServiceImpl.get(id));

	}
}
