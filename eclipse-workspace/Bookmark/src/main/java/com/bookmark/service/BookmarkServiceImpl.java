package com.bookmark.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.bookmark.main.Bookmark;
import com.bookmark.main.BookmarkCity;
import com.bookmark.main.BookmarkCityRequest;
import com.bookmark.main.City;
import com.bookmark.repository.BookmarkCityRepository;
import com.bookmark.repository.BookmarkRepository;
import com.bookmark.repository.CityRepository;


@Service
public class BookmarkServiceImpl implements BookmarkService {

	@Autowired private BookmarkCityRepository bookmarkcityrepository;
	@Autowired private BookmarkRepository bookmarkrepository;
	@Autowired private CityRepository cityrepository;
	
	
	/*to create a bookmark */

	@Override
	public Bookmark createBookmark(BookmarkCityRequest bookmarkcityrequest) {
		
		BookmarkCity bookmarkcity = new BookmarkCity();
		Bookmark bookmark = new Bookmark();
		
		City city = cityrepository.getOne(bookmarkcityrequest.getCityId());
		bookmarkcity.setCity(city);
		
		bookmark.setTitle(bookmarkcityrequest.getBookmarkTitle());
		
		return bookmarkrepository.save(bookmark);
	}
	
	
	/* to show all the bookmarks */
	@Override
	public List<Bookmark> showBookmark() {
		// TODO Auto-generated method stub
		return bookmarkrepository.findAll();
	}

	/* deletes a bookmark */
	@Override
	public ResponseEntity<Bookmark> removeBookmark(Long id) {
		// TODO Auto-generated method stub
		Bookmark bookmark = bookmarkrepository.getOne(id);
		if(bookmark == null) {
			return ResponseEntity.notFound().build();
		}
		bookmarkrepository.delete(bookmark);
		return ResponseEntity.ok().body(bookmark);	
	}
	
	@Override
	public ResponseEntity<Bookmark> findById(Long id) {
		Bookmark bookmark = bookmarkrepository.getOne(id);
		if(bookmark == null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok().body(bookmark);
	}
	
	

}
