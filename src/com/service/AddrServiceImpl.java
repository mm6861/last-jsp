package com.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.dao.AddrDAO;
import com.dao.impl.AddrDAOImpl;

public class AddrServiceImpl implements AddrService {
	private AddrDAO adao= new  AddrDAOImpl();
	@Override
	public List<Map<String, String>> selectAddrList(Map<String,String> addr) {
		
		return adao.selectAddrList(addr);
	}
	
}
