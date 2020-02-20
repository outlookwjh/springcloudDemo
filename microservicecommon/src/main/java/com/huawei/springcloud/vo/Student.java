package com.huawei.springcloud.vo;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tb_student")
public class Student {
    @Id
    @GeneratedValue
    private Integer id; // 编号

    @Column(length=50)
    private String name; // 姓名

    @Column(length=50)
    private String grade; // 年级


}
