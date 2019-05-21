package com.naicha.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.naicha.dao.FootDao;
import com.naicha.entity.Foot;
import com.naicha.util.DBManager;

public class FootDaoimpl implements FootDao {

	public Foot queryCompany() {
		Foot company = new Foot();
		
		ResultSet rs = DBManager.querySQL("select * from company;");
		try {
			while (rs.next()){
				company.setId(rs.getInt(1));
				company.setName(rs.getString(2));
				company.setPhone(rs.getString(3));
				company.setEmail(rs.getString(4));
				company.setAddress(rs.getString(5));
			
				//....
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return company;
	}

}
