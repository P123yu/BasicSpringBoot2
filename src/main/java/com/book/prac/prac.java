//package com.book.prac;
//
//
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Component;
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.PersistenceContext;
//import jakarta.transaction.Transactional;
//
//@Component
//public class prac {
//
//    @PersistenceContext
//    private EntityManager entityManager;
//
//    @Transactional
//   // @Scheduled(cron="@daily") // Cron expression for midnight every day
//    @Scheduled(fixedRate=5000)
//    public void deleteColumnName() {
//    	System.out.print("removed ");
//        String query = "update book SET book_name = ''";
//        entityManager.createNativeQuery(query).executeUpdate();
//        
//    }
//}
//
