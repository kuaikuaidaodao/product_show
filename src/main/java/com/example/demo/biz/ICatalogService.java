package com.example.demo.biz;

import com.example.demo.entity.FirstlevelEntity;
import com.example.demo.entity.UserinfoEntity;

import java.util.List;

/**
 * @author li
 * @create 2018-02-07 14:14
 * @desc 用户
 **/
public interface ICatalogService {
   List<FirstlevelEntity> findAll();
//增加 修改
    void saveAndflush(FirstlevelEntity firstlevelEntity);
// 删除
   void delete(String ids);
}
