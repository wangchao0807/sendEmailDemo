package com.example.demo.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class SendEmailService {

        @Autowired
        private JavaMailSender javaMailSender;
}
