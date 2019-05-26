package com.lqw.supermarketGuideSystem.comment.service;

import com.lqw.supermarketGuideSystem.comment.domain.Comment;

import java.util.List;

/**
 * @AUTHOR: liuquanwei
 * @DATE: 2019/4/11
 * @TIME: 21:35
 */


public interface CommentService {
    /**
     * 保存评论
     *
     * @param comment
     * @return
     */
    Boolean saveComment(Comment comment);

    /**
     * 查找
     *
     * @param id
     * @return
     */
    List<Comment> findCommentByMerchantId(int id);
}
