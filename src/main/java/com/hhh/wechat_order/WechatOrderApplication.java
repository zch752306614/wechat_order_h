package com.hhh.wechat_order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class WechatOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(WechatOrderApplication.class, args);
    }

}
