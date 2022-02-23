package com.example.service;

import java.util.List;

import com.example.model.MovieModel;

public interface MovieService {
	List<MovieModel> findAll();
	List<MovieModel> findById(Long id);
}
