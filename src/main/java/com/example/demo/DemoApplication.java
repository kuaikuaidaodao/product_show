package com.example.demo;


import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.builder.SpringApplicationBuilder;

import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


@SpringBootApplication
@Controller
@EnableCaching
public class DemoApplication extends SpringBootServletInitializer {
    @RequestMapping("/")
	String home() {
		return "index";
	}

        @Override
        protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
            return builder.sources(DemoApplication.class);
        }
    @RequestMapping("/add.do")
    @ResponseBody
    public String addBanner(HttpServletRequest request){
        String name=null;
        // 提供解析时的一些缺省配置
        DiskFileItemFactory factory = new DiskFileItemFactory();
        // 创建一个解析器，分析InputStream，该解析器会将分析结果封装成一个FileItem对象的集合
        // 一个FileItem对应一个表单域
        ServletFileUpload sfu = new ServletFileUpload(factory);
        try {
            List<FileItem> items = sfu.parseRequest(request);
            for (int i = 0; i < items.size(); i++) {
                FileItem item = items.get(i);
                if (item.getName() != null) {
                    String path = request.getSession().getServletContext().getRealPath("/") + "\\pic\\";
                    File file1 = new File(path);
                    if(!file1.mkdirs()){
                        file1.mkdir();
                    }
                    String filename = item.getName().trim().split("\\.")[1];
                    //格式化日期
                    SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmssSSS");
                    name=format.format(new Date()) + "."+filename;
                    File file = new File(path + "\\" +name);
                    item.write(file);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{

        }

        return name;
    }
}