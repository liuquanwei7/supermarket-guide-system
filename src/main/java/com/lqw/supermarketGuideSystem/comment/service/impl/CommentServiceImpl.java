package com.lqw.supermarketGuideSystem.comment.service.impl;

import com.lqw.supermarketGuideSystem.comment.domain.Comment;
import com.lqw.supermarketGuideSystem.comment.repository.CommentRepository;
import com.lqw.supermarketGuideSystem.comment.service.CommentService;
import com.lqw.supermarketGuideSystem.common.exception.discount.ApiDiscountGetNullException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @AUTHOR: liuquanwei
 * @DATE: 2019/4/11
 * @TIME: 21:37
 */


@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    CommentRepository repository;

    @Override
    public Boolean saveComment(Comment comment) {
       int result = repository.saveOne(comment.getMerchantId(),comment.getUserId(),comment.getStar(),comment.getContent());
        if(result>0) {
            return true;
        }else {
            return false;
        }
    }

    @Override
    public List<Comment> findCommentByMerchantId(int id) {
        List<Comment> result = repository.findByMerchantId(id);
        if(result.size()>0){
            return result;
        }else {
            throw new ApiDiscountGetNullException("获取折扣信息失败！");
        }
    }
}
