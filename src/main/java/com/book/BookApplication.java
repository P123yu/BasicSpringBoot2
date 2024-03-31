package com.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
//import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class BookApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookApplication.class, args);
    }

}



//@Scheduled(fixedRate = 5000)
//public void printHelloWorld1() {
//  System.out.println("Hello, World1!");
//}
//
//@Scheduled(fixedDelay = 5000)
//public void printHelloWorld2() {
//  System.out.println("Hello, World2!");
//}
//
//@Scheduled(cron = "*/5 * * * * *")
//public void printHelloWorld3() {
//  System.out.println("Hello, World3!");
//}
//
//@Scheduled(cron = "@hourly")
//public void printHelloWorld4() {
//  System.out.println("Hello, World4!");
//}
  
//    Expressions such as 0 0 * * * * are hard for humans to parse and are, 
//    therefore, hard to fix in case of bugs. To improve readability,
//    Spring now supports the following macros, which represent commonly 
//    used sequences. You can use these macros instead of the six-digit value,
//    thus: 

// @Scheduled(cron = "@hourly").



//
//@yearly (or @annually)
//once a year (0 0 0 1 1 *)
//
//@monthly
//once a month (0 0 0 1 * *)
//
//@weekly
//once a week (0 0 0 * * 0)
//
//@daily (or @midnight)
//once a day (0 0 0 * * *), or
//
//@hourly
//once an hour, (0 0 * * * *)


