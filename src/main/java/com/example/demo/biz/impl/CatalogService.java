package com.example.demo.biz.impl;

import com.example.demo.biz.ICatalogService;
import com.example.demo.dao.ICatalogRepository;
import com.example.demo.entity.FirstlevelEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author li
 * @create 2018-02-07 14:14
 * @desc 用户
 **/
@Service
public class CatalogService implements ICatalogService {
    @Autowired
    ICatalogRepository iCatalogRepository;
    @Override
    public List<FirstlevelEntity> findAll() {
        return iCatalogRepository.findAll();
    }

    @Override
    public void saveAndflush(FirstlevelEntity firstlevelEntity) {
        iCatalogRepository.saveAndFlush(firstlevelEntity);
    }

    @Override
    public void delete(String ids) {
        String[] idss=ids.split(",");
        if (idss.length>0) {
            for (String id : idss)
                iCatalogRepository.delete(Long.valueOf(id));
        }
    }
}
