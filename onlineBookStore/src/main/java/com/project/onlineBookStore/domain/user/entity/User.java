package com.project.onlineBookStore.domain.user.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {
    private int num; // 유저 식별번호
    private String name; // 유저 이름
    private String id; // 유저 아이디
    private String pw; // 유저 비밀번호

}
