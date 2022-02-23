package com.example.dao.Impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.example.dao.GenericDao;
import com.example.mapper.RowMapper;
import com.example.model.GenreModel;
import com.example.service.GenreService;

public class AbstractDaoImpl<T> implements GenericDao<T> {
	public Connection connection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/jsp_servletdb";
			String username = "root";
			String password = "123456";
			Connection connection = DriverManager.getConnection(url, username, password);
			System.out.println("Connect db success!");
			return connection;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Class not found!");
			e.printStackTrace();
			return null;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Can't connect!");
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<T> query(String sql, RowMapper<T> maprow, Object... params) {
		// TODO Auto-generated method stub
		List<T> result = new ArrayList<>();
		Connection connection = connection();
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try {
			pstm = connection.prepareStatement(sql);
//			setParameter(pstm, params);
			rs = pstm.executeQuery();
			while (rs.next()) {
				result.add(maprow.rowMapper(rs));
			}
			return result;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
				if (pstm != null) {
					pstm.close();
				}
				if (rs != null) {
					rs.close();
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	public PreparedStatement setParameter(String sql, Object... params) {
		PreparedStatement pstm = null;

		try {
			System.out.println("heeloo");
			pstm = connection().prepareStatement(sql);
			for (Object obj : params) {
				if (obj instanceof String) {
					pstm.setString(2, (String) obj);
					pstm.execute();
				} else if (obj instanceof Long) {
					pstm.setLong(1, (long) obj);
					pstm.execute();
				}

			}
			System.out.println(pstm);
			return pstm;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}

	@Override
	public List<T> queryBy(String sql, RowMapper<T> maprow, Object... params) {
		// TODO Auto-generated method stub
		List<T> result = new ArrayList<>();
		Connection connection = connection();
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try {
			pstm = setParameter(sql, params);
			rs = pstm.executeQuery();
			while (rs.next()) {
				result.add(maprow.rowMapper(rs));
			}
			return result;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
				if (pstm != null) {
					pstm.close();
				}
				if (rs != null) {
					rs.close();
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	public static void test(Object... params) {
		for (Object obj : params) {
			System.out.println(obj);
		}
	}

	@Override
	public void insert(String sql, RowMapper<T> maprow, Object... params) {
		// TODO Auto-generated method stub
		Connection connection = connection();
		PreparedStatement pstm = null;
		try {
			pstm = connection.prepareStatement(sql);
			setParams(pstm, params);
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public PreparedStatement setParams(PreparedStatement pstm, Object... params) {
		int index = 0;
		try {
			for (int i = 0; i < params.length; i++) {
				index = i  + 1;
				if (params[i] instanceof String) {
					pstm.setString(index, (String) params[i]);
				} else if (params[i] instanceof Long) {
					pstm.setLong(index, (long) params[i]);
				} else if (params[i] instanceof Integer) {
					pstm.setInt(index, (int) params[i]);
				}
			}
			pstm.executeUpdate();
			System.out.println("insert success!");
			return pstm;
		}

		catch (SQLException ex) {
			return null;
		}

	}

	@Override
	public void update(String sql, RowMapper<T> maprow, Object... params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String sql, RowMapper<T> maprow, Object... params) {
		// TODO Auto-generated method stub
		
	}

//	public static void main(String[] args) {
//
//	}
}
