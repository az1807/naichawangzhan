package com.naicha.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.naicha.dao.CompanyDao;
import com.naicha.entity.Company;
import com.naicha.util.DBManager;

public class CompanyDaoimpl implements CompanyDao {

	public Company queryCompany() {
		Company company = new Company();
		
		ResultSet rs = DBManager.querySQL("select * from company;");
		try {
			while (rs.next()){
				company.setId(rs.getInt(1));
				company.setName(rs.getString(2));
				company.setWangzhi(rs.getString(3));
				//....
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return company;
	}

}
