package com.example.demo.dao.impl;

import com.example.demo.dao.ICatalogDao;
import com.example.demo.dao.IUserinfoDao;
import com.example.demo.entity.UserinfoEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * @author li
 * @create 2018-02-07 14:15
 * @desc 用户
 **/
@Repository
public class CatalogDao implements ICatalogDao {
    @PersistenceContext
    private EntityManager entityManager;

}
