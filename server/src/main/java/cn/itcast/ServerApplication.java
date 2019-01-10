package cn.itcast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import sun.net.www.http.HttpClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Description: ServerApplication
 * @Author: ding
 * @Date: 2019/1/7 21:19
 * @Version: 1.0
 */

@SpringBootApplication
@MapperScan("cn.itcast.mapper")
@EnableDiscoveryClient
public class ServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class);
    }
}
