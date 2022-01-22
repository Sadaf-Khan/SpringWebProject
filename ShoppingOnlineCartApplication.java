package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

 @SpringBootApplication

@EnableAutoConfiguration(exclude = { //  
        DataSourceAutoConfiguration.class, //
        DataSourceTransactionManagerAutoConfiguration.class, //
        HibernateJpaAutoConfiguration.class })
 
 
public class ShoppingOnlineCartApplication{

    public static void main(String[] args) {
 try {
        SpringApplication.run(ShoppingOnlineCartApplication.class, args);}
 catch(Exception e) {System.out.println(e);}

    

    }
  

}