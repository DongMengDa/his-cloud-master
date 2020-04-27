package com.choice.his.consumer.fallback;

import com.choice.his.consumer.service.FeignService;
import com.choice.his.pojo.TbStore;
import feign.hystrix.FallbackFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TestFallBack implements FallbackFactory<FeignService> {
    @Override
    public FeignService create(Throwable cause) {
        // TODO Auto-generated method stub
        return new FeignService() {

            //对应接口写降级方法
            public TbStore queryStoreById(Long id) {
                List<TbStore> list = new ArrayList<TbStore>();
                TbStore tbStore = new TbStore();
                tbStore.setId(id);
                tbStore.setRemark("查无此人");
                list.add(tbStore);
                return tbStore;
            }

            //对应接口写降级方法
            public List<TbStore> getAllStore() {
                List<TbStore> list = new ArrayList<TbStore>();
                TbStore tbStore = new TbStore();
                tbStore.setRemark("查无此人list");
                list.add(tbStore);
                return list;
            }

        };
    }
}