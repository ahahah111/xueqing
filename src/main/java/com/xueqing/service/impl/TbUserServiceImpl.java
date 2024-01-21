package com.xueqing.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xueqing.entity.Stu;
import com.xueqing.entity.TbUser;
import com.xueqing.entity.Teacher;
import com.xueqing.form.LoginForm;
import com.xueqing.form.SearchForm;
import com.xueqing.mapper.TbUserMapper;
import com.xueqing.service.TbUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xueqing.vo.PageVO;
import com.xueqing.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author admin
 * @since 2024-01-13
 */
@Service
public class TbUserServiceImpl extends ServiceImpl<TbUserMapper, TbUser> implements TbUserService {

    @Autowired
    private TbUserMapper tbUserMapper;

    @Override
    public ResultVO login(LoginForm loginForm) {
        //1.判断用户是否存在
        QueryWrapper<TbUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_name",loginForm.getUsername());
        TbUser tbUser = this.tbUserMapper.selectOne(queryWrapper);

        //返回的信息
        ResultVO resultVO = new ResultVO();
        if(tbUser==null){
            resultVO.setCode(-1);
            resultVO.setMess("用户为空");
        }
        else {
            ///判断密码是否相等的情况
            if(!tbUser.getUserPass().equals(loginForm.getPasswd())){//密码不相等
                resultVO.setCode(-2);
                resultVO.setMess("密码不相等");
            }
            else {
                resultVO.setCode(0);//登录成功
                resultVO.setData(tbUser);
                resultVO.setMess("登录成功");
            }

        }
        return resultVO;
    }

    @Override
    public PageVO list(Integer page, Integer size) {

        Page<TbUser> tbUserPage = new Page<>(page,size);
        Page<TbUser> resultPage1 = this.tbUserMapper.selectPage(tbUserPage,null);
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
        Page<TbUser> stuPage = new Page<>(searchForm.getPage(),searchForm.getSize());
        Page<TbUser> result =null;

        //System.out.println("+++++++++++++++++++");
        if(searchForm.getValue().equals(""))//可以两个空一起查询，必选的是key,非必选的是value
        {   //非必选项为空时
            result = this.tbUserMapper.selectPage(stuPage, null);

        }
        else{//非必选项不为空
            QueryWrapper<TbUser> queryWrapper = new QueryWrapper<>();
            queryWrapper.like(searchForm.getKey(),searchForm.getValue());///第一,二字段都不为空时，进行模糊查询
            result = this.tbUserMapper.selectPage(stuPage, queryWrapper);
        }
        PageVO pageVO = new PageVO();
        pageVO.setTotal(result.getTotal());
        pageVO.setData(result.getRecords());
        return pageVO;
    }
}
