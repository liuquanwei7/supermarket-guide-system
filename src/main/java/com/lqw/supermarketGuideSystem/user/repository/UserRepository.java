package com.lqw.supermarketGuideSystem.user.repository;

import com.lqw.supermarketGuideSystem.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @AUTHOR: liuquanwei
 * @DATE: 2019/2/13
 * @TIME: 14:33
 */


public interface UserRepository extends JpaRepository<User, Integer> {
    /**
     * 根据account查找用户信息
     *
     * @param account
     * @return 用户实体，此实体可能为缺省值
     */
    Optional<User> findByAccount(String account);
}
