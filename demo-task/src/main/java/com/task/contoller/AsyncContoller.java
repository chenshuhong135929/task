package com.task.contoller;

import com.task.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AsyncContoller {

  @Autowired
  private AsyncService asyncService;

  @GetMapping("hello")
  public String hello(){
    asyncService.hello();

    return  "success";
  }

}
