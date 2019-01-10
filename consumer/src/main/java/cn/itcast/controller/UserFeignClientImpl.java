package cn.itcast.controller;

import cn.itcast.pojo.User;
import org.springframework.stereotype.Component;

/**
 * @Description: UserFeignClientImpl
 * @Author: ding
 * @Date: 2019/1/9 20:18
 * @Version: 1.0
 */

@Component
public class UserFeignClientImpl implements UserFeignClient {
    @Override
    public User queryUserById(Long id) {
        User user = new User();
        user.setName("连接超时，请稍后重试");
        return user;
    }
}
