package cn.itcast.demo;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

/**
 * @Description: Test1
 * @Author: ding
 * @Date: 2019/1/8 15:00
 * @Version: 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Test1 {
@Autowired
private HttpClient httpClient;
    @Test
    public void test() throws IOException {
        HttpGet request = new HttpGet("http://localhost/hello/2");
        String response = this.httpClient.execute(request, new BasicResponseHandler());
        System.out.println(response);
    }
}
