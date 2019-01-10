package cn.itcast.service;

import cn.itcast.controller.UserFeignClient;
import cn.itcast.dao.UserDao;
import cn.itcast.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Description: UserService
 * @Author: ding
 * @Date: 2019/1/7 20:52
 * @Version: 1.0
 */

@Service
public class ConsumerService {

    @Autowired
    private UserFeignClient userFeignClient;

    public List<User> queryUser(List<Long> ids) {

        ArrayList<User> list = new ArrayList<>();
        ids.forEach(id -> list.add(userFeignClient.queryUserById(id)));
        return list;
    }

}
