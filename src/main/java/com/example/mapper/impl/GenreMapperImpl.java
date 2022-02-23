package com.example.mapper.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.mapper.RowMapper;
import com.example.model.GenreModel;

public class GenreMapperImpl implements RowMapper<GenreModel> {

	@Override
	public GenreModel rowMapper(ResultSet rs) {
		// TODO Auto-generated method stub
		GenreModel genre = new GenreModel();
		try {
			genre.setGenreId(rs.getLong(1));
			genre.setGenreName(rs.getString(2));
			return genre;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}

}
