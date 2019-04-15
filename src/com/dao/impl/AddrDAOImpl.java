package com.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.common.DBConnector;
import com.dao.AddrDAO;

public class AddrDAOImpl implements AddrDAO{
	private static String selectAddrListsql = "select * from address where ad_num>=1 and ad_num<101";
	@Override
	public List<Map<String, String>> selectAddrList(Map<String, String> map) {
		try {
			PreparedStatement ps = DBConnector.getCon().prepareStatement(selectAddrListsql);
			ResultSet rs = ps.executeQuery();
			List<Map<String,String>> addrList = new ArrayList<>();
			while(rs.next()) {
				Map<String,String> address = new HashMap<>();
				address.put("ad_num",rs.getString("ad_num"));
				address.put("ad_code",rs.getString("ad_code"));
				address.put("ad_sido",rs.getString("ad_sido"));
				address.put("ad_gugun",rs.getString("ad_gugun"));
				address.put("ad_dong",rs.getString("ad_dong"));
				address.put("ad_bunji",rs.getString("ad_bunji"));
				address.put("ad_ho",rs.getString("ad_ho"));
				addrList.add(address);
			}
			return addrList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				return null;
	}

	@Override
	public Map<String, String> selectAddr(Map<String, String> map) {
		
		return null;
	}

	@Override
	public int insertAddr(Map<String, String> addr) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateAddr(Map<String, String> addr) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteAddr(Map<String, String> addr) {
		// TODO Auto-generated method stub
		return 0;
	}
	public static void main(String[] args) {
		AddrDAO  ad= new AddrDAOImpl();
		Map<String,String> a = new HashMap<>();
		System.out.println(ad.selectAddrList(a));
	
	}

}
