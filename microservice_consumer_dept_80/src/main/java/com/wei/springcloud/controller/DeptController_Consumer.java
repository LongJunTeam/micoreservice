package com.wei.springcloud.controller;

import com.wei.springcloud.entitys.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Objects;

/**
 * Created by Administrator on 2019/11/25 0025.
 */
@RestController
public class DeptController_Consumer {
    private static final String REST_URL_PREFIX = "http://localhost:8001";

    @Autowired
    RestTemplate restTemplate;

    @PostMapping("/consumer/dept/add")
    public boolean add(@RequestBody Dept dept) {

        return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add",dept,Boolean.class);
    }

    @GetMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){

        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/"+id,Dept.class);

    }

    @GetMapping
    public List<Dept> list(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list",List.class);
    }

    @RequestMapping("/consumer/dept/discovery")
    public Object discovery(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/discovery", Object.class);
    }
}
