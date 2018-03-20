package com.example.demo.dao.impl;

import com.example.demo.dao.IUserinfoRepository;
import com.example.demo.entity.hello;
import com.example.demo.entity.userEntity;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
@Transactional
public class userinfoRepository implements IUserinfoRepository {
    //这里的单引号不能少，否则会报错，被识别是一个对象;
    public static final String CACHE_KEY = "'demoInfo'";

    private static final String DEMO_CACHE_NAME = "demo";
    @PersistenceContext
    private EntityManager entityManager;



    @Override
    @Cacheable(value="demo",key="'demoInfo_'+#name")
    public userEntity getuserEntityByName(String name) {
       TypedQuery<userEntity> query = this.entityManager.createQuery(" from  userEntity u where u.name=:name  ",userEntity.class);
        query.setParameter("name",name);
        System.out.println("数据库查询--------------------");
        userEntity userEntity = (userEntity)query.getSingleResult();
        return userEntity;
    }


//    @Override
//    public void save(userEntity userEntity) {
//        this.entityManager.merge(userEntity);
//    }


//    @Override
//    public  List<hello> getHelloByName(String name) {
//       Query query= this.entityManager.createNativeQuery("select * from USER_INFO where name=:name",hello.class);
//        query.setParameter("name",name);
//        List<hello> object= ( List<hello>) query.getResultList();
//        return object;
//    }
}
