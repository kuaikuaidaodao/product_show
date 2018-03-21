package com.example.demo.Controller;

import com.example.demo.biz.ICatalogService;
import com.example.demo.biz.IUserinfoService;
import com.example.demo.entity.FirstlevelEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author li
 * @create 2018-03-20 15:10
 * @desc 目录查询
 **/
@Controller
@RequestMapping("catalog")
public class CatalogController {
  @Autowired
  ICatalogService iCatalogService;
  /*
     一级目录查询
   */
    @RequestMapping("firstlevel_find")
    @ResponseBody
    public List<FirstlevelEntity> firstlevelfind(){
        return iCatalogService.findAll();
    }
  /*
   一级目录增加 修改
 */
  @RequestMapping("saveAndflush")
  public void firstlevelfind(FirstlevelEntity firstlevelEntity){
    iCatalogService.saveAndflush(firstlevelEntity);
  }
  /*
     一级目录删除
   */
  @RequestMapping("delete")
  public void delete(String ids){
    iCatalogService.delete(ids);
  }
}
