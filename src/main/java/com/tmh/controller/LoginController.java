package com.tmh.controller;

import com.tmh.model.Userlogin;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Jacey on 2017/6/30.
 */
@Controller
public class LoginController {

    //登录跳转
    @RequestMapping(value = "/login", method = {RequestMethod.GET})
    public String loginUI() throws Exception {
        return "../../login";
    }

    //登录表单处理
    @RequestMapping(value = "/login", method = {RequestMethod.POST})
    public String login(Userlogin userlogin) throws Exception {
        if ("admin".equals(userlogin.getUsername())) {//管理员登录
            return "redirect:/admin/showStudent.action";
        } else if ("1001".equals(userlogin.getUsername())) {//老师登录
            return "redirect:/teacher/showCourse.action";
        } else if ("10001".equals(userlogin.getUsername())) {//学生登录
            return "redirect:/student/showCourse.action";
        }
        return "/login";
    }

}
