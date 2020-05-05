package com.example.model;

public class BookmarkCityRequest {

	private Long cityId;
	
	private String bookmarkTitle;
	
	private Long userId;

	/* G&S for city id */
	public Long getCityId() {
		return cityId;
	}

	
	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}

	/* G&S for title */
	public String getBookmarkTitle() {
		return bookmarkTitle;
	}
	
	
	public void setBookmarkTitle(String bookmarkTitle) {
		this.bookmarkTitle = bookmarkTitle;
	}

	/* G&S for user ID */
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	public BookmarkCityRequest() {
		
	}

	
	
}
