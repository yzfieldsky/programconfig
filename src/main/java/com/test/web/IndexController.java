package com.test.web;

import com.test.core.OutputService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "/index")
public class IndexController {

    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/say")
    @ResponseBody
    public Object say() {
        return 1;
    }

    @Resource
    OutputService outputService;

    @RequestMapping(value = "/linkCore")
    @ResponseBody
    public Object core() {
        return outputService.getName();
    }
}
