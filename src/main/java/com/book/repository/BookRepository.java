package com.book.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.book.model.BookModel;

import jakarta.transaction.Transactional;

public interface BookRepository extends JpaRepository<BookModel,Long> {
	
	
//	@Query("select d from BookModel d")
//	List<BookModel>puraLelo();
	
	
	
	@Query(value = "SELECT * FROM book", nativeQuery = true)
    List<BookModel> puraLelo();
	
	
//	@Query(value = "SELECT * FROM book where book_id=14", nativeQuery = true)
//    BookModel ekLelo();
	
	 @Query(value = "SELECT * FROM book WHERE book_id = ?1", nativeQuery = true)
	 BookModel ekLelo(Long bookId);
	 
	 @Query(value = "SELECT * FROM book WHERE book_id = ?1 AND book_name = ?2", nativeQuery = true)
	    BookModel donoLelo(Long bookId, String bookName);
	
//	 @Query(value = "SELECT * FROM book WHERE book_id = :bookId", nativeQuery = true)
//	    BookModel ekLelo(@Param("bookId") Long bookId);
	

	 @Modifying
	 @Transactional
	 @Query("UPDATE BookModel b SET b.bookName = ''")
	 void updateBookNames();
	 
	 
	 
//	  @Modifying
//	    @Transactional
//	    @Query(value = "UPDATE book SET book_name = ''", nativeQuery = true)
//	    void updateBookNames();
	
}
