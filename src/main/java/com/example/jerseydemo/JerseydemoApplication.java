package com.example.jerseydemo;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jersey.ResourceConfigCustomizer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JerseydemoApplication {

    @Bean
    public ResourceConfig resourceConfig() {
        return new ResourceConfig();
    }

    @Bean
    public ResourceConfigCustomizer myResourceConfigCustomizer(){
        return new MyResourceConfigCustomizer();
    }

    public static void main(String[] args) {
        SpringApplication.run(JerseydemoApplication.class, args);
    }

}
