package com.example.dao;

import java.util.List;

import com.example.model.NationModel;

public interface NationDao {
	List<NationModel> findAll();

	List<NationModel> findbyId(Long id);

	List<NationModel> findbyName(String name);

	void save(NationModel nation);
}
