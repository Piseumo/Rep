package org.tth;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.tth.components.AA;
import org.tth.conf.MyConf;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(MyConf.class);

        Arrays.stream(applicationContext.getBeanDefinitionNames())
                .forEach(System.out::println);

        AA aa = applicationContext.getBean(AA.class);
        System.out.println("aa = "+ aa);

        AA aa1 = applicationContext.getBean(AA.class);
        System.out.println("aa1 = "+ aa1);

        AA aa2 = applicationContext.getBean(AA.class);
        System.out.println("aa2 = "+ aa2);

        AA aa3 = new AA();
        AA aa4 = new AA();
        System.out.println("aa3 = "+ aa3);
        System.out.println("aa4 = "+ aa4);

        aa1.setName("스프링통안에 있는 객체");
        System.out.println("aa = " +aa);
        System.out.println("aa1 = " +aa1);
        System.out.println("aa2 = " +aa2);

    }
}