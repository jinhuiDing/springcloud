package cn.itcast.config;

import feign.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: LogConfig
 * @Author: ding
 * @Date: 2019/1/9 19:44
 * @Version: 1.0
 */

@Configuration
public class LogConfig {
    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
