package com.example.mapper.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.mapper.RowMapper;
import com.example.model.MovieModel;

public class MovieMapperImpl implements RowMapper<MovieModel> {

	@Override
	public MovieModel rowMapper(ResultSet rs) {
		// TODO Auto-generated method stub
		try {
			MovieModel movie = new MovieModel();
			movie.setMovieId(rs.getLong(1));
			movie.setGenreId(rs.getLong(2));
			movie.setMovieName(rs.getString(3));
			movie.setAuthor(rs.getString(4));
			movie.setActor(rs.getString(5));
			movie.setViews(rs.getInt(6));
			movie.setDuration(rs.getInt(7));
			movie.setThumbnail(rs.getString(8));
			movie.setDescription(rs.getString(9));
			System.out.println("hello");
			System.out.println(movie.toString());
			return movie;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}

}
