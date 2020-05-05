package com.bookmark.service;

import java.util.List;


import com.bookmark.main.Bookmark;
import com.bookmark.main.BookmarkCity;
import com.bookmark.main.BookmarkCityRequest;
import com.bookmark.main.City;

public interface BookmarkService {

	// to create a Bookmark //
	public Bookmark createBookmark(BookmarkCityRequest bcr);
	
	// To list all the Bookmarks
	public List<Bookmark >showBookmark();
	
	//to delete a bookmark 
	public ResponseEntity<Bookmark> removeBookmark(Long id);
	
	// find a bookmark by id 
	public ResponseEntity<Bookmark> findById(Long id);
}
