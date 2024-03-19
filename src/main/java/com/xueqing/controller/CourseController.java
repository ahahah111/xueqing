package com.xueqing.controller;


import com.xueqing.entity.Course;
import com.xueqing.entity.TbUser;
import com.xueqing.form.SearchForm;
import com.xueqing.service.CourseService;
import com.xueqing.util.ResultVOUtil;
import com.xueqing.vo.PageVO;
import com.xueqing.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

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

    //查询所有
    @GetMapping("/list/{page}/{size}")//表示展示的是当前的第几页的几条数据，比如，第一页的10条数据
    public ResultVO list(@PathVariable("page") Integer page,@PathVariable("size") Integer size){
        //虽然方法是给定的，但是由于重新加入了分页构造器，所以需要重写该方法
        //List<DormitoryAdmin> list = this.dormitoryAdminService.list();

        PageVO list =  this.courseService.list(page, size);

        return ResultVOUtil.success(list);
    }

    //条件查询
    @GetMapping("/search")
    public ResultVO search(SearchForm searchForm){
        PageVO pageVO = this.courseService.search(searchForm);
        return ResultVOUtil.success(pageVO);
    }

    //修改第一步
    //查询指定的人
    @GetMapping("/findById/{id}")
    public ResultVO findById(@PathVariable("id") Integer id){
        Course byId = this.courseService.getById(id);
        return ResultVOUtil.success(byId);
    }
    //修改第二步
    //更新该对象
    @PostMapping("/update")
    public ResultVO update(@RequestBody Course course){
        boolean update = this.courseService.updateById(course);
        if(!update) return ResultVOUtil.fail();
        else return ResultVOUtil.success(null);
    }

    //删除
    @DeleteMapping("/deleteById/{id}")
    public ResultVO deleteById(@PathVariable("id") Integer id){
        boolean b = this.courseService.removeById(id);
        System.out.println(b);
        if(!b) return ResultVOUtil.fail();
        else return ResultVOUtil.success(null);
    }

}

