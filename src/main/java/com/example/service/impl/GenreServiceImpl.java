package com.example.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.example.dao.GenreDao;
import com.example.model.GenreModel;
import com.example.service.GenreService;

public class GenreServiceImpl implements GenreService {

	@Inject
	GenreDao genreDao;

	@Override
	public List<GenreModel> findAll() {
		// TODO Auto-generated method stub
		return genreDao.findAll();
	}

	@Override
	public List<GenreModel> findAll2() {
		// TODO Auto-generated method stub
		return genreDao.findAll2();
	}

	@Override
	public List<GenreModel> findbyId(Long id) {
		// TODO Auto-generated method stub
		return genreDao.findbyId(id);
	}

	@Override
	public void insert(GenreModel genre) {
		// TODO Auto-generated method stub
		genreDao.insert(genre);
	}

}
