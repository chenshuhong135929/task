package com.task;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringRunner;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.swing.plaf.TreeUI;
import java.io.File;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoTaskTestApplication {
  @Autowired
  JavaMailSenderImpl mailSender;

  @Test
  public void contextLoads(){
    SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
    simpleMailMessage.setSubject("今晚开会");
    simpleMailMessage.setText("开会内容");
    //发送给谁
    simpleMailMessage.setTo("1505277861@qq.com");
    //谁发送的
    simpleMailMessage.setFrom("1048369112@qq.com");
    //发送
    mailSender.send(simpleMailMessage);
  }

  @Test
  public void test02() throws MessagingException {
    //创建一个复杂的消息邮件

    MimeMessage mimeMessage = mailSender.createMimeMessage();
    MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);

    mimeMessageHelper.setSubject("今晚开会");
    mimeMessageHelper.setText("开会内容");
    //发送给谁
    mimeMessageHelper.setTo("1505277861@qq.com");
    //谁发送的
    mimeMessageHelper.setFrom("1048369112@qq.com");
    //上传文件
    mimeMessageHelper.addAttachment("psb.webp",new File("C:\\Users\\Administrator\\Desktop\\psb.webp"));
    //发送
    mailSender.send(mimeMessage);
  }
}
