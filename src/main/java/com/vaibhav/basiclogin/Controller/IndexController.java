package com.vaibhav.basiclogin.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by kaushv5 on 6/29/2018.
 */
@Controller
public class IndexController {

    @RequestMapping(path = {"/login","/"}, method = RequestMethod.GET)
    public String LoginPage(){
        return "login";
    }

    @RequestMapping(path = "/home",method = RequestMethod.GET)
    public String HomePage(){ return "home";}

    @RequestMapping(path = "/signup",method = RequestMethod.GET)
    public String SignupPage(){ return "signup";}

//    @RequestMapping(path = {"/logout"}, method = RequestMethod.GET)
//    public String LogoutPage(){
//        return "logout";
//    }
}
