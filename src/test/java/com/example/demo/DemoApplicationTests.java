package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Autowired
    private JavaMailSender javaMailSender;

    @Test
    public void contextLoads() {
        sendEmail();
    }

    public void sendEmail(){
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        //从什么邮箱发送
        mailMessage.setFrom("xxxxxx.com");
        mailMessage.setTo("xxxxxxxx@qq.com");
        //设置发送主题
        mailMessage.setSubject("测试邮件");
        //设置发送邮件的正文
        mailMessage.setText("您好");
        javaMailSender.send(mailMessage);
    }

}
