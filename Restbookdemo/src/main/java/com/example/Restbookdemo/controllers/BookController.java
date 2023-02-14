package com.example.Restbookdemo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Restbookdemo.entities.Books;
import com.example.Restbookdemo.services.BookService;

@RestController
public class BookController {
 //@RequestMapping(value = "/books" , method = RequestMethod.GET)
	@Autowired
	BookService bookservice;
@GetMapping(value = "/books")
 public ResponseEntity<List<Books>> getBoobks() {
		/*
		 * Books book =new Books(); book.setId(1); book.setBookname("java");
		 * book.setAuthor("efr");
		 */
	    List<Books> list =bookservice.getAllBooks();
	if(list.size()<=0)
		{
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		
		}
	return ResponseEntity.of(Optional.of(list));
	}
@GetMapping(value ="/books/{id}")
public Books getBook(@PathVariable("id")int id) {
	return this.bookservice.getBookById(id);
}

@PostMapping("/books")	
public Books addBooks(@RequestBody Books b) {
	Books book=bookservice.addBooks(b);
	return book;
}
@DeleteMapping("/books/{bid}")
public void deleteBook(@PathVariable("bid") int bid) {
	bookservice.deleteBook(bid);
}
@PutMapping("books/{bid}")
public Books updateBook(@RequestBody Books b, @PathVariable("bid") int bid)
{
	bookservice.updateBook(b, bid);
	return b;
}
	
}
