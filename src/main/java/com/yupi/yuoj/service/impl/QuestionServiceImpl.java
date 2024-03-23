package com.yupi.yuoj.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yupi.yuoj.model.entity.Question;
import com.yupi.yuoj.service.QuestionService;
import com.yupi.yuoj.mapper.QuestionMapper;
import org.springframework.stereotype.Service;

/**
* @author w1309
* @description 针对表【question(题目)】的数据库操作Service实现
* @createDate 2024-03-23 15:43:43
*/
@Service
public class QuestionServiceImpl extends ServiceImpl<QuestionMapper, Question>
    implements QuestionService{

}




