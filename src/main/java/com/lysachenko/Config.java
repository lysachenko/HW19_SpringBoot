package com.lysachenko;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(H2.class)
public class Config {

    @Bean
    public H2DaoImpl h2Dao(){
        return new H2DaoImpl();
    }
}
