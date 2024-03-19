package com.xueqing.controller;


import com.xueqing.entity.Course;
import com.xueqing.entity.TbUser;
import com.xueqing.service.CourseService;
import com.xueqing.util.ResultVOUtil;
import com.xueqing.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author admin
 * @since 2024-01-13
 */
@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    //添加
    @PostMapping("/save")
    public ResultVO save(@RequestBody Course course){
        //除了get请求，其他请求都需要添加@RequestBody

        boolean save = this.courseService.save(course);//这是它本来就拥有的方法

        if(!save) return ResultVOUtil.fail();//直接返回封装的类
        else return ResultVOUtil.success(null);//返回封装的类，且添加对象是不需要返回对象的


    }
}

