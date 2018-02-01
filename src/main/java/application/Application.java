package application;

import application.controller.HelloWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

@SpringBootApplication
public class Application {

  @Autowired
  private HelloWorld helloWorld;
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
