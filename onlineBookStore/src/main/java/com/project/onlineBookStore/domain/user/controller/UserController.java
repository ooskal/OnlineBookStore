package com.project.onlineBookStore.domain.user.controller;

import com.project.onlineBookStore.domain.user.dto.UserDto;
import com.project.onlineBookStore.domain.user.entity.User;
import com.project.onlineBookStore.domain.user.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/users")
@RequiredArgsConstructor //생성자를 자동으로 주입
@Slf4j // 추상 레이어를 제공하는 인터페이스 모음, 로깅 라이브러리를 변경할때 코드의 변경없이 가능
public class UserController {

    private final UserService userService;

    @GetMapping("/signUpUser")
    public String getInsertUser(Model model) {
        model.addAttribute("user", new UserDto());
        return "user/signUpUser";
    }
    @PostMapping("/signUpUser")
    public String postInsertUser(UserDto userDto) {
        log.info("UserDto: " + userDto.toString());
        userService.addUser(userDto);
        return "user/signUpUser";
    }
    @GetMapping("/deleteUser")
    public String getDeleteUser(Model model) {
        model.addAttribute("user", new UserDto());
        return "user/deleteUser";
    }
    @PostMapping("/deleteUser")
    public String postDeleteUser(UserDto userDto) {
        log.info("UserDto: " + userDto.toString());
        userService.deleteUser(userDto);
        return "user/deleteUser";
    }
    @GetMapping("/updateUser")
    public String getUpdateUser(HttpSession session, Model model) {
        String myId = (String) session.getAttribute("loginId"); // 오브젝트가 더 커서 강제 형변환
        UserDto userDto = userService.updateUser(myId);
        model.addAttribute("updateUser", userDto);

        return "user/updateUser";
    }
    @PostMapping("/updateUser")
        public String update(@ModelAttribute UserDto userDto) {
            userService.update(userDto);
            log.info("User pw: " + userDto.toString());

            return "redirect:/index" ;
       }
    @GetMapping("/login")
    public String getLogin() {

        return "login";
    }
    @PostMapping("/login")
    public String login(@ModelAttribute UserDto userDto,HttpSession session) {
        UserDto loginResult = userService.login(userDto);
        if(loginResult != null) { // 로그인 성공
            session.setAttribute("member", loginResult);
            log.info("로그인: " + userDto.toString());

            return "index";
        } else { //로그인 실패
            log.info("로그인: " + userDto.toString());

            return "login";
        }
    }
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate(); // 세션 무효화

        return "index";
    }
}
