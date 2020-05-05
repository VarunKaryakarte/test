package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.model.Bookmark;
import com.example.model.BookmarkCity;
import com.example.model.BookmarkCityRequest;
import com.example.model.City;
import com.example.repository.BookmarkCityRepository;
import com.example.repository.BookmarkRepository;
import com.example.repository.CityRepository;
import com.example.repository.UserRepository;

@Service
public class BookmarkServiceImpl implements BookmarkService {

	@Autowired private BookmarkCityRepository bookmarkcityrepository;
	@Autowired private BookmarkRepository bookmarkrepository;
	@Autowired private CityRepository cityrepository;
	@Autowired private UserRepository userrepository;
	
	
	/*to create a bookmark */

	@Override
	public Bookmark createBookmark(BookmarkCityRequest bookmarkcityrequest) {
		
		BookmarkCity bookmarkcity = new BookmarkCity();
		Bookmark bookmark = new Bookmark();
		//City cityobj = new City();
		
		 bookmark.setTitle(bookmarkcityrequest.getBookmarkTitle());
		 bookmark.setUserId(bookmarkcityrequest.getUserId());
		
		 City city = cityrepository.getOne(bookmarkcityrequest.getCityId());
		 bookmarkcity.setCity(city);
		 bookmarkcity.setBookmark(bookmark);
    	 bookmark.getBookmarkcity().add(bookmarkcity);
	


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
