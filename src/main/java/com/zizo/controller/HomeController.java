package com.zizo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Dynashety on 2016/4/11.
 */

@Controller
public class HomeController {

    @RequestMapping(value = "/",method = RequestMethod.GET,produces = {"text/html;charset=UTF-8"})
    public String index() {
        return "index";
    }
}
