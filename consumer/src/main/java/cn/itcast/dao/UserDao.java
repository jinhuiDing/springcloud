package cn.itcast.dao;

import cn.itcast.pojo.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description: UserDao
 * @Author: ding
 * @Date: 2019/1/9 18:37
 * @Version: 1.0
 */
@Component
public class UserDao {
    @Autowired
    private RestTemplate restTemplate;


    private static final Logger logger = LoggerFactory.getLogger(UserDao.class);

    @HystrixCommand(fallbackMethod = "queryUserByIdFallbackMethod")
    public User queryUserById(Long id) {
        long begin=System.currentTimeMillis();
        String url = "http://user-server/user/";

        User user = restTemplate.getForObject(url + id, User.class);

        long end = System.currentTimeMillis();

        logger.info("访问用时：{}",end-begin);
        return user;
    }

    public User queryUserByIdFallbackMethod(Long id) {
        User user = new User();
        user.setName("查询失败了");
        return user;
    }
}
