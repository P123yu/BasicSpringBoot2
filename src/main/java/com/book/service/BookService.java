package com.book.service;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.book.model.BookModel;
import com.book.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;
	
	public BookModel insert(BookModel bookModel) {
		BookModel bookIns =bookRepository.save(bookModel);
		return bookIns;		
	}
	
	
	public List<BookModel> getAll(){
		List<BookModel> bookList=bookRepository.findAll();
		return bookList;
	}
	
	
	public List<BookModel> getAll1(){
		List<BookModel> bookList=bookRepository.puraLelo();
		return bookList;
	}
	
	public void delete(long id) {
		bookRepository.deleteById(id);
	}
	
	
	public BookModel update(long id,BookModel bookModel) {
		boolean result=bookRepository.existsById(id);
		if(result) {
			bookModel.setBookId(id);
			return bookRepository.save(bookModel);
		}
		else {
			return null;
		}
		
	}
	
	public BookModel getId(long book) {
		return bookRepository.findById(book).orElse(null);
	}
	
	public BookModel getId1(long book) {
		return bookRepository.ekLelo(book);
	}
	
	
	

	public BookModel getIdName(long book,String name) {
		return bookRepository.donoLelo(book,name);
	}
	
//	public BookModel getId1() {
//		return bookRepository.ekLelo();
//	}
	
	
	 //@Scheduled(cron="@daily") // Cron expression for midnight every day
//    @Scheduled(fixedRate=5000)
//    public void deleteColumnName() {
//        System.out.print("removed ");
//        bookRepository.updateBookNames();
//    }
	
	
	
	
	
	

}
