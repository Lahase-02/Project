package com.example.Restbookdemo.services;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.example.Restbookdemo.dao.BookRepository;
import com.example.Restbookdemo.entities.Books;
@Component
public class BookService {
	
//	 static private List <Books>  list = new ArrayList();
//	
//	static {
//		
//		list.add(new Books(1,"java1","vtfd"));
//		list.add(new Books(2,"java2","vgd"));
//		list.add(new Books(3,"java3","vfy"));
//	}
	@Autowired
	 private  BookRepository bookrepository ;
	
public List getAllBooks() {
	List<Books> list =(List<Books>) bookrepository.findAll();
	return list;
}


public Books getBookById(int id) {
	
	Books book =null;
	
	/*
	 * book=list.stream().filter(e->e.getId()==id).findFirst().get(); boolean
	 * book1=list.removeIf(b->b.getId()==id);
	 */
	     book=  bookrepository.findById(id);
	return book;
}

public Books addBooks(Books b) {
	//list.add(b);
	bookrepository.save(b);
	return b;
}
public void deleteBook(int id ) {
	//boolean book1=list.removeIf(b->b.getId()==id);
	bookrepository.deleteById(id);
}

public void updateBook(Books ub, int bid ) {
	
	/*
	 * list= list.stream().map(b-> { if(b.getId()==bid) {
	 * b.setBookname(ub.getBookname()); b.setAuthor(ub.getAuthor()); } return b;
	 * }).collect(Collectors.toList());
	 * 
	 */
	bookrepository.save(ub);
}

}
