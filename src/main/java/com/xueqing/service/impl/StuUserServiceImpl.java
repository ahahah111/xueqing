package com.xueqing.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xueqing.entity.StuUser;
import com.xueqing.entity.TbUser;
import com.xueqing.form.LoginForm;
import com.xueqing.mapper.StuUserMapper;
import com.xueqing.service.StuUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xueqing.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author admin
 * @since 2024-01-21
 */
@Service
public class StuUserServiceImpl extends ServiceImpl<StuUserMapper, StuUser> implements StuUserService {

    @Autowired
    private StuUserMapper stuUserMapper;

    @Override
    public ResultVO login(LoginForm loginForm) {
        //1.判断用户是否存在
        QueryWrapper<StuUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_name",loginForm.getUsername());
        StuUser stuUser = this.stuUserMapper.selectOne(queryWrapper);

        //返回的信息
        ResultVO resultVO = new ResultVO();
        if(stuUser==null){
            resultVO.setCode(-1);
            resultVO.setMess("用户为空");
        }
        else {
            ///判断密码是否相等的情况
            if(!stuUser.getUserPass().equals(loginForm.getPasswd())){//密码不相等
                resultVO.setCode(-2);
                resultVO.setMess("密码不相等");
            }
            else {
                resultVO.setCode(0);//登录成功
                resultVO.setData(stuUser);
                resultVO.setMess("登录成功");
            }

        }
        return resultVO;
    }
}
