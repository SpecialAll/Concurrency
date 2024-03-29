package com.zxh.concurrency.example.threadLocal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
@RequestMapping("/threadLocal")
public class ThreadLocalController {

    @RequestMapping("/test")
    @ResponseBody
    public Long test(){
        return RequestHolder.getId();
    }

}
