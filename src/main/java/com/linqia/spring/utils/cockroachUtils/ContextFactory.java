package com.linqia.spring.utils.cockroachUtils;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ContextFactory {
    private static ConfigurableApplicationContext ctx;

    public static ConfigurableApplicationContext getContext(String[] args) {
        if(ctx != null){
            return ctx;
        }
        synchronized (ContextFactory.class){
            if(ctx != null){
                return ctx;
            }
            ctx = SpringApplication.run(ContextFactory.class, args);
            return ctx;
        }
    }
}

