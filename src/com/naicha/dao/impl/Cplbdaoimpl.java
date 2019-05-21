package com.naicha.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.naicha.dao.Cplbdao;
import com.naicha.entity.Cplb;
import com.naicha.util.DManager;

public class Cplbdaoimpl implements Cplbdao {

	public List <Cplb> queryProductTypes() {
		List<Cplb> pts = new ArrayList<Cplb>();

		ResultSet rs = DManager.querySQL("select * from lb;");

		try {
			while (rs.next()) {
				Cplb pt = new Cplb();
				pt.setCplbid(rs.getInt(1));
				pt.setCplbname(rs.getString(2));
				pts.add(pt);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return pts;
	}

}


