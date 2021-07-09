package com.laioffer.SecondHandMarket;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        //通过注解配置类
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
    }

}
