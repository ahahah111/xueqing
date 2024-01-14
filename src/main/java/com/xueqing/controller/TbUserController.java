package com.xueqing.controller;


import com.xueqing.entity.Stu;
import com.xueqing.entity.TbUser;
import com.xueqing.form.LoginForm;
import com.xueqing.form.SearchForm;
import com.xueqing.service.TbUserService;
import com.xueqing.service.TeacherService;
import com.xueqing.util.ResultVOUtil;
import com.xueqing.vo.PageVO;
import com.xueqing.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import java.text.SimpleDateFormat;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author admin
 * @since 2024-01-13
 */
@RestController
@RequestMapping("/tbUser")//教务人员端
public class TbUserController {

    @Autowired
    private TbUserService tbUserService;

    @GetMapping("/login")
    public ResultVO login(LoginForm loginForm){
        ResultVO resultVO = this.tbUserService.login(loginForm);
        return resultVO;
    }

    //添加教务人员
    @PostMapping("/save")
    public ResultVO save(@RequestBody TbUser tbUser){
        //除了get请求，其他请求都需要添加@RequestBody

        boolean save = this.tbUserService.save(tbUser);//这是它本来就拥有的方法

        if(!save) return ResultVOUtil.fail();//直接返回封装的类
        else return ResultVOUtil.success(null);//返回封装的类，且添加对象是不需要返回对象的


    }

    //查询所有教务人员
    @GetMapping("/list/{page}/{size}")//表示展示的是当前的第几页的几条数据，比如，第一页的10条数据
    public ResultVO list(@PathVariable("page") Integer page,@PathVariable("size") Integer size){
        //虽然方法是给定的，但是由于重新加入了分页构造器，所以需要重写该方法
        //List<DormitoryAdmin> list = this.dormitoryAdminService.list();

        PageVO list =  this.tbUserService.list(page, size);

        return ResultVOUtil.success(list);
    }

    //条件查询
    @GetMapping("/search")
    public ResultVO search(SearchForm searchForm){
        PageVO pageVO = this.tbUserService.search(searchForm);
        return ResultVOUtil.success(pageVO);
    }

    //修改第一步
    //查询指定的人
    @GetMapping("/findById/{id}")
    public ResultVO findById(@PathVariable("id") Integer id){
        TbUser byId = this.tbUserService.getById(id);
        return ResultVOUtil.success(byId);
    }
    //修改第二步
    //更新该对象
    @PostMapping("/update")
    public ResultVO update(@RequestBody TbUser tbUser){
        boolean update = this.tbUserService.updateById(tbUser);
        if(!update) return ResultVOUtil.fail();
        else return ResultVOUtil.success(null);
    }

    //删除
    @DeleteMapping("/deleteById/{id}")
    public ResultVO deleteById(@PathVariable("id") Integer id){
        boolean b = this.tbUserService.removeById(id);
        System.out.println(b);
        if(!b) return ResultVOUtil.fail();
        else return ResultVOUtil.success(null);
    }

}

