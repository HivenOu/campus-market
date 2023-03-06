package com.secondhandmarket;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableSwagger2Doc
@MapperScan("com.secondhandmarket.mapper")
public class App {
    public static void main(String[] args) {
     /*   new SpringApplicationBuilder(App.class).listeners(new TestListener())
                        .initializers(new TestInitializer()).run(args);*/
        SpringApplication.run(App.class,args);

    }
    @Bean
    ApplicationListener<ApplicationReadyEvent> getListener(){
        return applicationReadyEvent -> System.out.println("this is a lambda listener"+applicationReadyEvent.getApplicationContext().getId());
    }
}