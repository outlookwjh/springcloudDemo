package com.huawei.springcloud.controller;

import com.huawei.springcloud.vo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.List;

@RestController
public class StudentProviderController {

    @Autowired
    private RestTemplate restTemplate;


    @PostMapping(value="/save")
    public boolean save(Student student){
       return restTemplate.postForObject("http://localhost:1001/student/save",student,Boolean.class);
    }

    /**
     * 查询学生信息
     * @return
     */
    @GetMapping(value="/list")
    public List<Student> list(){
        List<Student> list = restTemplate.getForObject("http://localhost:1001/student/list", List.class);
        return list;
    }

    /**
     * 根据id查询学生信息
     * @return
     */
    @GetMapping(value="/get/{id}")
    public Student get(@PathVariable("id") Integer id){
      return   restTemplate.getForObject("http://localhost:1001/student/list"+id,Student.class);
    }

    /**
     * 根据id删除学生信息
     * @return
     */
    @GetMapping(value="/delete/{id}")
    public boolean delete(@PathVariable("id") Integer id){
        try {
            restTemplate.delete("http://localhost:1001/student/delete"+id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
