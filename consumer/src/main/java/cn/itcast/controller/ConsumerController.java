package cn.itcast.controller;


import cn.itcast.pojo.User;
import cn.itcast.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description: ConsumerController
 * @Author: ding
 * @Date: 2019/1/7 20:53
 * @Version: 1.0
 */

@RestController
@RequestMapping("user")
public class ConsumerController {
    @Autowired
    private ConsumerService consumerService;


    @GetMapping("/{ids}")
    public List<User> queryUser(@PathVariable("ids") List<Long> ids) {
       return consumerService.queryUser(ids);
    }

}
