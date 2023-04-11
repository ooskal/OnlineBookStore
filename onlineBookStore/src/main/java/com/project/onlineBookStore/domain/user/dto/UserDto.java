package com.project.onlineBookStore.domain.user.dto;

import lombok.Data;
import lombok.NoArgsConstructor; //접근 제한 -> 기본 생성자의 무분별한 생성을 막아 의도하지 않은 엔티티를 만드는 것을 막을 수 있음.

@Data
@NoArgsConstructor
public class UserDto {
    private String name;
    private String id;
    private String pw;
}