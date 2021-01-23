package com.llicat.dao;

import com.llicat.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 实现JpaRepository 封装了常用的增删改查
 * @author: lipan
 * @date: 2021/1/23 20:37
 */

public interface UserDao extends JpaRepository<User,Integer> {


}
