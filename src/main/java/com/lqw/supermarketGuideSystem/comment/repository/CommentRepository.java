package com.lqw.supermarketGuideSystem.comment.repository;

import com.lqw.supermarketGuideSystem.comment.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
 * @AUTHOR: liuquanwei
 * @DATE: 2019/4/11
 * @TIME: 21:30
 */


public interface CommentRepository extends JpaRepository<Comment,Integer> {
    /**
     * 保存
     *
     * @param merchantId
     * @param userId
     * @param star
     * @param content
     * @return
     */
    @Transactional
    @Modifying
    @Query(value = "insert into comment (merchant_id, user_id, comment_time, star, content)  values(?1,?2,sysdate(),?3,?4)",nativeQuery = true)
    int saveOne(int merchantId, int userId, int star, String content);

    /**
     * 通过merchantId查找评论信息
     *
     * @param id
     * @return
     */
    List<Comment> findByMerchantId(@Param("id") int id);
}
