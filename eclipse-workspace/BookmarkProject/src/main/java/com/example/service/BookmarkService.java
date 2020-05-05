package com.example.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.example.model.Bookmark;
import com.example.model.BookmarkCity;
import com.example.model.BookmarkCityRequest;
import com.example.model.City;

public interface BookmarkService {

	// to create a Bookmark //
	public Bookmark createBookmark(BookmarkCityRequest bcr);
	
	// To list all the Bookmarks
	public List<Bookmark >showBookmark();
	
	//to delete a bookmark 
	public ResponseEntity<Bookmark> removeBookmark(Long id);
	
	// find a bookmark by id 
	public ResponseEntity<Bookmark> findById(Long id);
	
	//update a bookmark
	//public void updateBookamrk(BookmarkCityRequest bcr);
}
