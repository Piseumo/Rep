package org.tth.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.tth.components.AA;
import org.tth.components.BB;
import org.tth.components.CC;

@Configuration
public class MyConf {
    @Bean
    public AA aa(){
        return new AA();
    }

    @Bean
    public BB bb(){
        return new BB();
    }

    @Bean
    public CC cc(){
        return new CC();
    }



}
