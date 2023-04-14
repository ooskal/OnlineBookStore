package com.project.onlineBookStore.domain.user.controller;

import com.project.onlineBookStore.domain.book.entity.Book;
import com.project.onlineBookStore.domain.user.dto.UserDto;
import com.project.onlineBookStore.domain.user.entity.User;
import com.project.onlineBookStore.domain.user.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/users")
@RequiredArgsConstructor //생성자를 자동으로 주입
@Slf4j // 추상 레이어를 제공하는 인터페이스 모음, 로깅 라이브러리를 변경할때 코드의 변경없이 가능
public class UserController {

    private final UserService userService;

    @GetMapping("/insertUser")
    public String getInsertUser(Model model) {
        model.addAttribute("user", new UserDto());
        return "insertUser";
    }

    @PostMapping("/insertUser")
    public String postInsertUser(UserDto userDto) {
        log.info("UserDto: " + userDto.toString());
        userService.addUser(userDto);
        return "insertUser";
    }

    @GetMapping("/deleteUser")
    public String getDeleteUser(Model model) {
        model.addAttribute("user", new UserDto());
        return "deleteUser";
    }

    @PostMapping("/deleteUser")
    public String postDeleteUser(UserDto userDto) {
        log.info("UserDto: " + userDto.toString());
        userService.deleteUser(userDto);
        return "deleteUser";
    }

    @GetMapping("/selectUser")
    public String list(Model model) {
        List<User> users = userService.findUsers();


        model.addAttribute("users", users);
        log.info("Users: " + users.toString());

        return "SelectUser";
    }

    @GetMapping("/updateUser")
    public String getUpdateUser(Model model,UserDto userDto) {
        model.addAttribute("user", userDto);
        return "updateUser";
    }

    @PostMapping("/updateUser")
    public String postUpdateUser(UserDto userDto) {
        log.info("UserDto: " + userDto.toString());
        userService.updateUser(userDto);
        return "updateUser";
    }


}
