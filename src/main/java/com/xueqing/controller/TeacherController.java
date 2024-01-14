package com.xueqing.controller;


import com.xueqing.entity.Stu;
import com.xueqing.entity.TbUser;
import com.xueqing.entity.Teacher;
import com.xueqing.form.LoginForm;
import com.xueqing.form.SearchForm;
import com.xueqing.service.TeacherService;
import com.xueqing.util.ResultVOUtil;
import com.xueqing.vo.PageVO;
import com.xueqing.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

/**
 * <p>
 * 教师表 前端控制器
 * </p>
 *
 * @author admin
 * @since 2024-01-13
 */
@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping("/login")
    public ResultVO login(LoginForm loginForm){
        ResultVO resultVO = this.teacherService.login(loginForm);
        return resultVO;
    }

    //添加教师
    @PostMapping("/saveTeacher")
    public ResultVO addStu(@RequestBody Teacher teacher){
        boolean save = this.teacherService.save(teacher);

        if(!save) return ResultVOUtil.fail();//返回工具类的失败的方法
        else return ResultVOUtil.success(null);//返回封装的对象，且添加成功不需要返回改对象
    }

    //查询所有教师
    @GetMapping("/list/{page}/{size}")//表示展示的是当前的第几页的几条数据，比如，第一页的10条数据
    public ResultVO list(@PathVariable("page") Integer page,@PathVariable("size") Integer size){
        //虽然方法是给定的，但是由于重新加入了分页构造器，所以需要重写该方法
        //List<DormitoryAdmin> list = this.dormitoryAdminService.list();

        PageVO list =  this.teacherService.list(page, size);

        return ResultVOUtil.success(list);
    }

    //条件查询
    @GetMapping("/search")
    public ResultVO search(SearchForm searchForm){
        PageVO pageVO = this.teacherService.search(searchForm);
        return ResultVOUtil.success(pageVO);
    }

    //修改第一步
    //查询指定的人
    @GetMapping("/findById/{id}")
    public ResultVO findById(@PathVariable("id") Integer id){
        Teacher byId = this.teacherService.getById(id);
        return ResultVOUtil.success(byId);
    }
    //修改第二步
    //更新该对象
    @PostMapping("/update")
    public ResultVO update(@RequestBody Teacher teacher){
        boolean update = this.teacherService.updateById(teacher);
        if(!update) return ResultVOUtil.fail();
        else return ResultVOUtil.success(null);
    }

    //删除
    @DeleteMapping("/deleteById/{id}")
    public ResultVO deleteById(@PathVariable("id") Integer id){
        boolean b = this.teacherService.removeById(id);
        System.out.println(b);
        if(!b) return ResultVOUtil.fail();
        else return ResultVOUtil.success(null);
    }
}

