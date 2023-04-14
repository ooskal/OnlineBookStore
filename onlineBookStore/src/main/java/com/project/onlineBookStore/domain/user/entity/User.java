package com.project.onlineBookStore.domain.user.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
public class User {
    private int num; // 유저 식별번호
    private String name; // 유저 이름
    private String id; // 유저 아이디
    private String pw; // 유저 비밀번호

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



    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
