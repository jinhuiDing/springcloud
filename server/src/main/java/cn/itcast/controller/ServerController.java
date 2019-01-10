package cn.itcast.controller;

import cn.itcast.pojo.User;
import cn.itcast.service.UService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description: ServerController
 * @Author: ding
 * @Date: 2019/1/7 21:02
 * @Version: 1.0
 */

@RestController
@RequestMapping("user")
public class ServerController {


    @Autowired
    private UService service;


    @RequestMapping("{id}")
    public User queryUser(@PathVariable("id") Long id) throws InterruptedException {
       return service.queryUser(id);
    }
}
