package com.project.onlineBookStore.domain.user.repository;
import com.project.onlineBookStore.domain.user.dto.UserDto;
import com.project.onlineBookStore.domain.user.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Mapper
@Repository
public interface UserMapper {
    List<User> findByAll();
    Optional<User> findByUserId(String user); // 아이디로 회원 정보 조회
    void insertUser(User user);
    void deleteUser(User user);
    public void updateUsers(UserDto userDto);


}
