package com.zhge38.git.test.gittest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 3.0
 * @Author :History.GreatMan.Mao
 * @Description:
 * @Date Created in 21:59 on 2018/10/29.
 */
@RestController
public class GitDevController {

    @RequestMapping("dev_1")
    public String dev_1(){
        return "dev_1";
    }

    @RequestMapping("dev_2")
    public String dev_2(){
        return "dev_2";
    }
}
