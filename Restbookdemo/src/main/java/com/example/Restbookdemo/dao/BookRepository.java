package com.example.Restbookdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.Restbookdemo.entities.Books;

public interface BookRepository extends JpaRepository<Books, Integer> {
 
	public Books findById(int id);
}
