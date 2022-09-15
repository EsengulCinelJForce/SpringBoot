package com.esengulcinel.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {  //security'i dahil etme
        org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class,
        org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration.class}
)



@ComponentScan("com.esengulcinel")   //used to specify base packages
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }

}
