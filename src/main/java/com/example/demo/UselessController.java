package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class UselessController {
     @RequestMapping("/login")
     public String get() {
    	 return "login.jsp";
     }
     @RequestMapping("/logout")
     public String get1() {
    	 return "logout.jsp";
     }
}
