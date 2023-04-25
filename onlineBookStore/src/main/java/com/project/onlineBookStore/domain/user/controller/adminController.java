package com.project.onlineBookStore.domain.user.controller;

import com.project.onlineBookStore.domain.user.dto.UserDto;
import com.project.onlineBookStore.domain.user.entity.User;
import com.project.onlineBookStore.domain.user.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpSession;

import java.util.List;

@Controller
@RequestMapping("/users")
@RequiredArgsConstructor //생성자를 자동으로 주입
@Slf4j
public class adminController {

    private final UserService userService;

    @GetMapping("/selectAllUser")
    public String list(Model model,HttpSession session) {
        UserDto userDto = (UserDto) session.getAttribute("member");

        if(userDto == null || !"ROLE_ADMIN".equals(userDto.getRole())){
             return "redirect:/index";
        }

        List<User> users = userService.findAllUsers();


        model.addAttribute("users", users);
        log.info("Users: " + users.toString());

        return "admin/SelectAllUser";
    }
}
