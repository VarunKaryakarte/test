package com.bookmark.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookmark.main.Bookmark;



public interface BookmarkRepository extends JpaRepository<Bookmark , Long> {

}
