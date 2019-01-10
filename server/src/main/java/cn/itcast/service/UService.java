package cn.itcast.service;

import cn.itcast.mapper.ServiceMapper;
import cn.itcast.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description: UService
 * @Author: ding
 * @Date: 2019/1/7 21:04
 * @Version: 1.0
 */




@Service
public class UService {
    @Autowired
    private ServiceMapper serviceMapper;
    public User queryUser(Long id) throws InterruptedException {
        long l = System.currentTimeMillis();

            Thread.sleep((long) (Math.random()*2000));

        long l1 = System.currentTimeMillis();
        System.out.println(l1-l+"===================================毫秒" + "..."+id);
//        new FileInputStream(new File(""));
        return serviceMapper.selectByPrimaryKey(id);
    }
}
