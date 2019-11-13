package com.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 开启异步注解
 * @EnableAsync
 * 异步方法
 * @Async
 * 开启定时任务注解
 * @EnableScheduling
 * 定时任务方法注解
 * @Scheduling
 *
 */

@SpringBootApplication
//开启异步
@EnableAsync
@EnableScheduling
public class DemoTaskApplication {
  public static void main(String[] args) {
    SpringApplication.run(DemoTaskApplication.class, args);
  }
}
