package com.bjsxt.controller;

import com.bjsxt.anno.MyAnnotation4Swagger;
import com.bjsxt.entity.MyEntity;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

/**
 * @Api - 描述当前类型生成帮助文档的信息
 *  属性 -
 *    - tags ： 给当前类型定义别名，可以有多个。定义几个别名，在ui视图中就显示几个控制器访问菜单。
 *    - description ： 给当前类型生成的帮助文档定义一个描述信息。
 */
@RestController
@Api(tags = {"MyController","Swagger学习控制器"}, description = "测试API类型描述信息")
public class MyController2 {

   @RequestMapping("/test")
    public void test(){
       System.out.println("test11222333444");
    }





}
