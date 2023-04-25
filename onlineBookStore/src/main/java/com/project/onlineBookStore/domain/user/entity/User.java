package com.project.onlineBookStore.domain.user.entity;

import com.project.onlineBookStore.domain.user.dto.UserDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;



@Getter
@Setter
public class User {


    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto_increment
    private int num; // 유저 식별번호
    private String name; // 유저 이름
    private String id; // 유저 아이디
    private String pw; // 유저 비밀번호
    private String role; // 유저 권한

    public User(){
    }

    public User(String name,String id,String pw){
        this.name = name;
        this.id = id;
        this.pw = pw;
    }

    public User(String id,String pw){
        this.id = id;
        this.pw = pw;
    }

    public static User toUserEntity(UserDto userDto){
        User user = new User();
        user.setId(userDto.getId());
        user.setName(userDto.getName());
        user.setPw(userDto.getPw());
        return user;
    }

    public static User toUpdateUserEntity(UserDto userDto){
        User user = new User();
        user.setNum(userDto.getNum());
        user.setId(userDto.getId());
        user.setName(userDto.getName());
        user.setPw(userDto.getPw());
        return user;
    }
}
