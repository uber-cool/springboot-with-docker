package application.controller;

import model.Message;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

  @RequestMapping("/greeting")
  public Message greetings(@RequestParam(value = "message", defaultValue = "There..!!") String name){
    return new Message("Hello "+name);
  }
}
