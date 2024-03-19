package com.xueqing.service.impl;

import com.xueqing.entity.Word;
import com.xueqing.mapper.WordMapper;
import com.xueqing.service.WordService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author admin
 * @since 2024-03-18
 */
@Service
public class WordServiceImpl extends ServiceImpl<WordMapper, Word> implements WordService {

}
