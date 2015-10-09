package com.centling.web.controller;

import com.centling.domain.LoginForm;
import com.centling.entity.UserEntity;
import com.centling.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by zhangpu on 2015-10-4.
 */
@Controller
public class LoginController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "login")
    public ModelAndView login(HttpServletRequest request, HttpServletResponse response, LoginForm command) {
        String username = command.getUsername();
        String password = command.getPassword();
        UserEntity userEntity = userService.getByUsername(username);
        ModelAndView mv = null;
        if (userEntity != null && userEntity.getPassword().equals(password)) {
            mv = new ModelAndView("/index/index", "command", "LOGIN2 SUCCESS:Hello-->" + username);
        } else if (userEntity != null && !userEntity.getPassword().equals(password)) {
            mv = new ModelAndView("/index/index", "command", "PASSWORD ERROR!bb");
        } else {
            mv = new ModelAndView("/index/index", "command", "USERNAME ERROR!aaa");
        }
        return mv;
    }
}

