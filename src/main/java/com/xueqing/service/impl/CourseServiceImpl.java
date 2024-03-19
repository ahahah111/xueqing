package com.xueqing.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xueqing.entity.Course;
import com.xueqing.entity.TbUser;
import com.xueqing.form.SearchForm;
import com.xueqing.mapper.CourseMapper;
import com.xueqing.service.CourseService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xueqing.vo.PageVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author admin
 * @since 2024-01-13
 */
@Service
public class CourseServiceImpl extends ServiceImpl<CourseMapper, Course> implements CourseService {

    @Autowired
    private CourseMapper courseMapper;

    @Override
    public PageVO list(Integer page, Integer size) {
        Page<Course> coursePage = new Page<>(page,size);
        Page<Course> resultPage1 = this.courseMapper.selectPage(coursePage,null);
        //第二个参数是设置还分页构造器的条件
        //以上代码获得了构造器所有的信息，但我们仅需要获取我们需要的就好

        //获取相关的信息
        PageVO pageVO = new PageVO();
        pageVO.setTotal(resultPage1.getTotal());
        pageVO.setData(resultPage1.getRecords());
        return pageVO;
    }

    @Override
    public PageVO search(SearchForm searchForm) {
        Page<Course> coursePage = new Page<>(searchForm.getPage(),searchForm.getSize());
        Page<Course> result =null;

        //System.out.println("+++++++++++++++++++");
        if(searchForm.getValue().equals(""))//可以两个空一起查询，必选的是key,非必选的是value
        {   //非必选项为空时
            result = this.courseMapper.selectPage(coursePage, null);

        }
        else{//非必选项不为空
            QueryWrapper<Course> queryWrapper = new QueryWrapper<>();
            queryWrapper.like(searchForm.getKey(),searchForm.getValue());///第一,二字段都不为空时，进行模糊查询
            result = this.courseMapper.selectPage(coursePage, queryWrapper);
        }
        PageVO pageVO = new PageVO();
        pageVO.setTotal(result.getTotal());
        pageVO.setData(result.getRecords());
        return pageVO;
    }
}
