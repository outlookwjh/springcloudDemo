package com.huawei.springcloud.service.impl;

import com.huawei.springcloud.repository.StudentRepository;
import com.huawei.springcloud.service.StudentService;
import com.huawei.springcloud.vo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository repository;


    @Override
    public void save(Student student) {
        repository.save(student);
    }

    @Override
    public Student findById(Integer id) {
        return repository.findOne(id);
    }

    @Override
    public List<Student> list() {
        return repository.findAll();
    }

    @Override
    public void delete(Integer id) {
        repository.delete(id);
    }
}
