package com.zhge38.git.test.gittest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 3.0
 * @Author :History.GreatMan.Mao
 * @Description:
 * @Date Created in 20:40 on 2018/10/29.
 */
@RestController
public class HelloController {

    @RequestMapping()
    public String test_1(){
        return "hello";
    }
}
