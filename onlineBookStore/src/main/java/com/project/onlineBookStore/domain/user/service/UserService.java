package com.project.onlineBookStore.domain.user.service;

import com.project.onlineBookStore.domain.user.dto.UserDto;
import com.project.onlineBookStore.domain.user.entity.User;
import com.project.onlineBookStore.domain.user.repository.UserMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor // 모든 필드 값을 파라미터로 받는 생성자를 만듦
public class UserService {
    private UserMapper userMapper;

    public void addUser(UserDto userDto) {
        userMapper.insertUser(new User(userDto.getName(),userDto.getId(),userDto.getPw()));
    }

    public void deleteUser(UserDto userDto) {
        userMapper.deleteUser(new User(userDto.getName(),userDto.getId(),userDto.getPw()));
    }
}
