package com.example.demo.dao;

import com.example.demo.entity.userEntity;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<userEntity, Long> {
    //这里的单引号不能少，否则会报错，被识别是一个对象;
    public static final String CACHE_KEY = "'demoInfo'";

    public static final String DEMO_CACHE_NAME = "demo";
    @Query(" from userEntity where name=:name ")
    @Cacheable(value="demo",key="'demoInfo_'")
    List<userEntity> findByName(@Param("name") String name);


    @Query(" from userEntity where name=:name and age=:age ")
    userEntity findByNameAndAge(@Param("name")String name,@Param("age") Integer age);

//    @Query(" delete from userEntity where id=:id")
//    @CacheEvict(value="demo",key="'demoInfo_'+#name")
//    void deleteById(@Param("id") Long id);

    @Override
    @CacheEvict(value="demo" ,key="'demoInfo_'" )
    void delete(Long id);


}