package com.project.onlineBookStore.domain.user.repository;
import com.project.onlineBookStore.domain.user.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    List<User> findById();

    void insertUser(User user);

    void deleteUser(User user);

    void updateUser(User user);
}
