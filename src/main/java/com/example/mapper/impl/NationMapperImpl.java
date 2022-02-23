package com.example.mapper.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.mapper.RowMapper;
import com.example.model.NationModel;

public class NationMapperImpl implements RowMapper<NationModel> {

	@Override
	public NationModel rowMapper(ResultSet rs) {
		// TODO Auto-generated method stub
		NationModel nation = new NationModel();
		try {
			nation.setNationId(rs.getLong("nationId"));
			nation.setNationName(rs.getString("nationName"));
			nation.setNationCode(rs.getString("code"));
			return nation;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}

}
