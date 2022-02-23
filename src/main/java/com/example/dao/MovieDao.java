package com.example.dao;

import java.util.List;

import com.example.model.MovieModel;

public interface MovieDao {
	List<MovieModel> findAll();
	List<MovieModel> findById(Long id);
}
