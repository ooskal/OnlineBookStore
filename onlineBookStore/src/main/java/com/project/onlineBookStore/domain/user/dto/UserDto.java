package com.project.onlineBookStore.domain.user.dto;

import com.project.onlineBookStore.domain.user.entity.User;
import lombok.Data;
import lombok.NoArgsConstructor; //접근 제한 -> 기본 생성자의 무분별한 생성을 막아 의도하지 않은 엔티티를 만드는 것을 막을 수 있음.

@Data
@NoArgsConstructor
public class UserDto {
    private int num;
    private String name;
    private String id;
    private String pw;
    private String role;

    public User toEntity() {
        User user = new User();
        user.setId(this.id);

        return user;
    }

    //엔티티에서 userDto 로 변환해서 가져오는거
    public static UserDto toUserDto(User user) {
        UserDto userDto = new UserDto();
        userDto.setNum(user.getNum());
        userDto.setId(user.getId());
        userDto.setPw(user.getPw());
        userDto.setName(user.getName());
        userDto.setRole(user.getRole());
        return userDto;
    }
}
