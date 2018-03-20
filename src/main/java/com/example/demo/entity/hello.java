package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class hello {
    @Id
    @GeneratedValue
    private  long id;
    @Column(nullable = false)
    private  String name1;
    @Column(nullable = false)
    private  String age;
    @Column(nullable = false)
    private  int test2;
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName1() {
        return name1;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public int getTest2() {
        return test2;
    }

    public void setTest2(int test2) {
        this.test2 = test2;
    }
}
