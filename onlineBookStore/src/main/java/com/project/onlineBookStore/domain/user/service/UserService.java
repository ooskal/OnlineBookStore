package com.project.onlineBookStore.domain.user.service;

import com.project.onlineBookStore.domain.user.dto.UserDto;
import com.project.onlineBookStore.domain.user.entity.User;
import com.project.onlineBookStore.domain.user.repository.UserMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public List<User> findAllUsers() {
        return userMapper.findByAll();
    }

    public UserDto updateUser(String myId) {
        Optional<User> optionalUser =userMapper.findByUserId(myId);
        if(optionalUser.isPresent()) {
            return UserDto.toUserDto(optionalUser.get());
        } else{
            return null;
        }
    }

    public void update(UserDto userDto) {
        userMapper.updateUsers(userDto);
    }

    public UserDto login(UserDto userDto) {

        Optional<User> userId = userMapper.findByUserId(userDto.getId());
        if(userId.isPresent()) {
            // 조회 결과가 존재
            User user = userId.get(); //.get 을 통해 안에 있는 객체를 가져 올 수 있음
            if(user.getPw().equals(userDto.getPw())) {
                //비밀번호 일치
                //엔티티객체를 dto 객체로 변환 후 리턴
                UserDto dto = UserDto.toUserDto(user);
                return dto;
            } else{
                //비밀번호 불일치
                return null;
            }

        } else{
            // 조회 결과가 존재 X
            return null;

        }


    }



}
