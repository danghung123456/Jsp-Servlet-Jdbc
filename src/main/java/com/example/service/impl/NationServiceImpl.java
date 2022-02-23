package com.example.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.example.dao.NationDao;
import com.example.model.NationModel;
import com.example.service.NationService;

public class NationServiceImpl implements NationService {

	@Inject
	private NationDao nationDao;

	@Override
	public List<NationModel> findAll() {
		// TODO Auto-generated method stub
		return nationDao.findAll();
	}

	@Override
	public List<NationModel> findbyId(Long id) {
		// TODO Auto-generated method stub
		return nationDao.findbyId(id);
	}

	@Override
	public List<NationModel> findbyName(String name) {
		// TODO Auto-generated method stub
		return nationDao.findbyName(name);
	}

	@Override
	public void save(NationModel nation) {
		// TODO Auto-generated method stub
		nationDao.save(nation);
	}

}
