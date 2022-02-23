package com.example.dao.Impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.dao.GenericDao;
import com.example.dao.GenreDao;
import com.example.mapper.impl.GenreMapperImpl;
import com.example.model.GenreModel;

public class GenreDaoImpl extends AbstractDaoImpl<GenreModel> implements GenreDao, GenericDao<GenreModel> {

	@Override
	public List<GenreModel> findAll() {
		// TODO Auto-generated method stub
		String sql = "select * from genre";
		Connection connect = connection();
		List<GenreModel> result = new ArrayList<GenreModel>();
		GenreMapperImpl genreMapper = new GenreMapperImpl();
		try {
			PreparedStatement pstm = connect.prepareStatement(sql);
			ResultSet rs = pstm.executeQuery();
			while (rs.next()) {
				result.add(genreMapper.rowMapper(rs));
			}
			return result;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}

	public List<GenreModel> findAll2() {
//		String sql = "select * from genre";
//		Connection connect = connection();
//		List<GenreModel> result = new ArrayList<GenreModel>();
//		PreparedStatement pstm = connect.prepareStatement(sql);
//		ResultSet rs = pstm.executeQuery();
//		while(rs.next()) {
//			return query(sql, new GenreMapperImpl());
//		}

		return query("select * from genre", new GenreMapperImpl());
	}

	@Override
	public List<GenreModel> findbyId(Long id) {
		// TODO Auto-generated method stub
		return queryBy("select * from genre where genreId = ?", new GenreMapperImpl(), id);
	}

	public void insert(GenreModel genre) {
		insert("insert into genre(genreName) values(?)", new GenreMapperImpl(), genre.getGenreName());
	}
}
