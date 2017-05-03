package cn.siwangyin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by zwy on 2017/5/3.
 */
@SpringBootApplication
@EnableEurekaServer
public class ServiceCenter {

    public static void main(String[] args) {
        SpringApplication.run(ServiceCenter.class, args);
    }

}
