package com.test.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data //自动生成get set方法 toString方法
//@NoArgsConstructor //自动生成无参构造函数
//@AllArgsConstructor //自动生成带所有参数的构造函数
public class Users {

    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Users(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
