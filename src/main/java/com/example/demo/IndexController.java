package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yc on 2018/2/8.
 */
@Controller
public class IndexController {

    @RequestMapping("/index")
    public   String index(){
        return "index";

    }
}
