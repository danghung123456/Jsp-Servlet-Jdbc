package com.example.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.example.dao.MovieDao;
import com.example.model.MovieModel;
import com.example.service.MovieService;

public class MovieServiceImpl implements MovieService {
	@Inject
	private MovieDao movieDao;
//	 public MovieServiceImpl() {
//		// TODO Auto-generated constructor stub
//		 movieDao = new MovieDaoImpl();
//		 
//	}

	@Override
	public List<MovieModel> findAll() {
		// TODO Auto-generated method stub
		System.out.println(movieDao.toString());
		return movieDao.findAll();
	}

	@Override
	public List<MovieModel> findById(Long id) {
		// TODO Auto-generated method stub
		return movieDao.findById(id);
	}

}
