package com.example.dao;

import java.util.List;

import com.example.model.GenreModel;

public interface GenreDao {
	List<GenreModel> findAll();
	List<GenreModel> findAll2();
	List<GenreModel> findbyId(Long id);
	void insert(GenreModel genre);
}
