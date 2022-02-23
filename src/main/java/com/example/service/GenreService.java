package com.example.service;

import java.util.List;

import com.example.model.GenreModel;

public interface GenreService {
	List<GenreModel> findAll();
	List<GenreModel> findAll2();
	List<GenreModel> findbyId(Long id);
	void insert(GenreModel genre);
}
