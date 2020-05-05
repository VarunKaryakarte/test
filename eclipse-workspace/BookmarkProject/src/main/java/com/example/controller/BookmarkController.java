package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Bookmark;
import com.example.model.BookmarkCityRequest;
import com.example.service.BookmarkServiceImpl;

@RestController
@RequestMapping("/bookmark")
public class BookmarkController {

	@Autowired BookmarkServiceImpl  bookmarkservice;
	
	@PostMapping("/create")
	public Bookmark createBookmark(@RequestBody BookmarkCityRequest bookmarkcityrequest ) {
		return bookmarkservice.createBookmark(bookmarkcityrequest);
		
	}
	
	@GetMapping("/show") 
	public List<Bookmark> findBookmark() {
		return bookmarkservice.showBookmark();
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Bookmark> deleteBookmark(@PathVariable Long id) {
		return bookmarkservice.removeBookmark(id);
	}
	
	@GetMapping(value ="/get/{id}" , produces = "application/json")
	public ResponseEntity<Bookmark> findById(@PathVariable Long id) {
		return bookmarkservice.findById(id);
	}
	
}
