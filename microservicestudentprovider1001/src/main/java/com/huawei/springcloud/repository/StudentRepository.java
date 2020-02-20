package com.huawei.springcloud.repository;

import com.huawei.springcloud.vo.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface StudentRepository extends JpaRepository<Student,Integer>,JpaSpecificationExecutor<Student>{
}
