package com.cxytiandi.sharding.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.cxytiandi.sharding.po.User;

@Mapper
public interface UserRepository {

    Long addUser(User user);

    List<User> list();

    User findById(Long id);

    List<User> findByName(@Param("name") String name, @Param("offset") int offset, @Param("size") int size);
}
