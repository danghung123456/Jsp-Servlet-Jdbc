package com.example.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.example.dao.GenericDao;
import com.example.dao.NationDao;
import com.example.mapper.impl.NationMapperImpl;
import com.example.model.NationModel;

public class NationDaoImpl extends AbstractDaoImpl<NationModel> implements NationDao, GenericDao<NationModel> {

	@Override
	public List<NationModel> findAll() {

		String sql = "select * from nation";
		return query(sql, new NationMapperImpl());
	}

	@Override
	public List<NationModel> findbyId(Long id) {

		String sql = "select * from nation where nationId = ?";
		return queryBy(sql, new NationMapperImpl(), id);
	}

	@Override
	public List<NationModel> findbyName(String name) {

		String sql = "select * from nation where nationName = ?";
		return queryBy(sql, new NationMapperImpl(), name);
	}

	@Override
	public void save(NationModel nation) {

		String sql = "insert into nation (nationName, Code) values(?, ?)";
		System.out.println("hello");
		Connection connection = null;
		try {
			connection = connection();
			PreparedStatement pstm = connection.prepareStatement(sql);
			connection.setAutoCommit(false);
			pstm.setString(1, nation.getNationName());
			pstm.setString(2, nation.getNationCode());
			System.out.println(pstm);
			int numRows = pstm.executeUpdate();
			if (numRows > 0) {
				System.out.println("insert success!");
			}
			;

			connection.commit();
			if (connection != null) {

				connection.rollback();
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		NationDaoImpl nim = new NationDaoImpl();
		NationModel nationModel = new NationModel();
		nationModel.setNationName("America");
		nationModel.setNationCode("A123456");
		nim.save(nationModel);
	}
}
