package com.zizo.controller;

import com.zizo.entity.cmsAnnouncementEntity;
import com.zizo.repository.DefaultRepository;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Dynashety on 2016/4/11.
 */

@Controller
@RequestMapping("/login")
public class LoginController {

    @RequestMapping(value = "/in",method = RequestMethod.GET,produces = {"text/html;charset=UTF-8"})
    public String in(HttpRequest request) {
        return "index";
    }

    @RequestMapping(value = "/out",method = RequestMethod.GET,produces = {"text/html;charset=UTF-8"})
    public String out() {
        return "index";
    }
}
