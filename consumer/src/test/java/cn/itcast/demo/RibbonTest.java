package cn.itcast.demo;

import cn.itcast.ConsumerApplication;
import cn.itcast.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.netflix.ribbon.RibbonLoadBalancerClient;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

/**
 * @Description: RibbonTest
 * @Author: ding
 * @Date: 2019/1/9 16:28
 * @Version: 1.0
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ConsumerApplication.class)
public class RibbonTest {

    @Autowired
    RibbonLoadBalancerClient client;

    @Test
    public void test() {

        for (int i = 0; i < 100; i++) {
            ServiceInstance choose = client.choose("user-server");
            System.out.println(choose.getPort());
        }
    }


}
