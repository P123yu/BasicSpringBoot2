package com.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.book.model.BookModel;
import com.book.service.BookService;

@RestController
@CrossOrigin
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	
	
	@PostMapping("/post")
	public ResponseEntity<String> insert(@RequestBody BookModel bookModel){
		BookModel bookCon=bookService.insert(bookModel);
		if(bookCon!=null) {
			return ResponseEntity.ok("successfully created");
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
	
	
	@GetMapping("/get")
	public ResponseEntity<List<BookModel>> getAll(){
		List<BookModel> book=bookService.getAll();
		if(book!=null) {
			return ResponseEntity.ok(book);
		}
		else {
			return ResponseEntity.notFound().build();
		}		
	}
	
	
	@GetMapping("/get1")
	public ResponseEntity<List<BookModel>> getAll1(){
		List<BookModel> book=bookService.getAll1();
		if(book!=null) {
			return ResponseEntity.ok(book);
		}
		else {
			return ResponseEntity.notFound().build();
		}		
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable long id) {
		bookService.delete(id);
	}
	
	@PutMapping("/put/{id}")
	public ResponseEntity<?> update(@PathVariable long id,@RequestBody BookModel bookmodel) {
		BookModel book=bookService.update(id,bookmodel);
		if(book!=null) {
			return ResponseEntity.ok("updated");
		}
		else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("not updated");
		}
		
		
	}
	
	@GetMapping("/get/{book}")
	public BookModel getId(@PathVariable long book) {
		return bookService.getId(book);
	}
	
	
	@GetMapping("/get1/{book}")
	public BookModel getId1(@PathVariable long book) {
		return bookService.getId1(book);
	}
	
	
	
	
	@GetMapping("/getIdName/{bookId}/{bookName}")
	public BookModel getIdName(@PathVariable long bookId,@PathVariable String bookName) {
		return bookService.getIdName(bookId,bookName);
	}
//	@GetMapping("/get1ek")
//	public BookModel getId1() {
//		return bookService.getId1();
//	}
//	
	
	
	
	
	
	

}
