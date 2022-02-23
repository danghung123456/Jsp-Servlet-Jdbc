package com.example.dao;

import java.util.List;
import com.example.mapper.RowMapper;

public interface GenericDao<T> {

	List<T> query(String sql, RowMapper<T> maprow, Object... params);

//	List<T> querybyId(String sql, RowMapper<T> maprow, Object... params);
	List<T> queryBy(String sql, RowMapper<T> maprow, Object... params);

	void insert(String sql, RowMapper<T> maprow, Object... params);

	void update(String sql, RowMapper<T> maprow, Object... params);

	void delete(String sql, RowMapper<T> maprow, Object... params);
}
