package com.example.demo.dao;

import com.example.demo.entity.hello;
import com.example.demo.entity.userEntity;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW )
//@CacheConfig
public interface IUserinfoRepository {
//    userEntity findByName(String name);
//    userEntity findByNameAndAge(String name, Integer age);
//    @Query(" from userEntity u where u.name=:name ")
//    userEntity findUserEntityByName(@Param("name")  String name);

//    @Modifying
//    @Query("select * from userEntity where name=:name ")
//    List selectByname(@Param("name") String name);   extends JpaRepository<userEntity,Long>
//    @Modifying
//    @Query("delete from userEntity u where u.id = :id")
//    void delete(Long id);


    userEntity getuserEntityByName(String name);
//    List<hello> getHelloByName(String name);
//    void update(userEntity userEntity);
//
//    void delete(Long id);
//
//    void save(userEntity userEntity);
}
