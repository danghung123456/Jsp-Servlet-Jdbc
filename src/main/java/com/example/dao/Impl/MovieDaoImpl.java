package com.example.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.dao.GenericDao;
import com.example.dao.MovieDao;
import com.example.mapper.RowMapper;
import com.example.mapper.impl.MovieMapperImpl;
import com.example.model.MovieModel;

public class MovieDaoImpl extends AbstractDaoImpl<MovieModel> implements MovieDao, GenericDao<MovieModel> {

	@Override
	public List<MovieModel> findAll() {
		// TODO Auto-generated method stub
		String sql = "select * from movie";
		return query(sql, new MovieMapperImpl());
	}

	@Override
	public List<MovieModel> findById(Long id) {
		// TODO Auto-generated method stub
		List<MovieModel> result = new ArrayList<MovieModel>();
		String sql = "select * from movie where movieId = ?";
		Connection connection = connection();
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try {
			pstm = connection.prepareStatement(sql);
			pstm.setLong(1, id);
			rs = pstm.executeQuery();
			while (rs.next()) {
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
				result.add(movie);
			}
			return result;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
