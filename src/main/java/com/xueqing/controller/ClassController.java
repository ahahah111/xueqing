package com.xueqing.controller;


import com.xueqing.entity.TbUser;
import com.xueqing.entity.classclass;
import com.xueqing.form.SearchForm;
import com.xueqing.service.ClassService;
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
@RequestMapping("/class")
public class ClassController {

    @Autowired
    private ClassService classService;

    @PostMapping("/save")
    public ResultVO addClass(classclass classclass){
        boolean save = this.classService.save(classclass);
        if(!save) return ResultVOUtil.fail();
        else return ResultVOUtil.success("添加成功！");
    }

    @GetMapping("/list/{page}/{size}")//表示展示的是当前的第几页的几条数据，比如，第一页的10条数据
    public ResultVO list(@PathVariable("page") Integer page, @PathVariable("size") Integer size){
        //虽然方法是给定的，但是由于重新加入了分页构造器，所以需要重写该方法
        //List<DormitoryAdmin> list = this.dormitoryAdminService.list();

        PageVO list =  this.classService.list(page, size);

        return ResultVOUtil.success(list);
    }

    //条件查询
    @GetMapping("/search")
    public ResultVO search(SearchForm searchForm){
        PageVO pageVO = this.classService.search(searchForm);
        return ResultVOUtil.success(pageVO);
    }

    //修改第一步
    //查询指定的人
    @GetMapping("/findById/{id}")
    public ResultVO findById(@PathVariable("id") Integer id){
        classclass byId = this.classService.getById(id);
        return ResultVOUtil.success(byId);
    }
    //修改第二步
    //更新该对象
    @PostMapping("/update")
    public ResultVO update(@RequestBody classclass classclass){
        boolean update = this.classService.updateById(classclass);
        if(!update) return ResultVOUtil.fail();
        else return ResultVOUtil.success(null);
    }

    //删除
    @DeleteMapping("/deleteById/{id}")
    public ResultVO deleteById(@PathVariable("id") Integer id){
        boolean b = this.classService.removeById(id);
        System.out.println(b);
        if(!b) return ResultVOUtil.fail();
        else return ResultVOUtil.success(null);
    }
}

