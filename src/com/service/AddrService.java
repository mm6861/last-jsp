package com.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public interface AddrService {
	public List<Map<String,String>> selectAddrList(Map<String,String> addr);

	
}
