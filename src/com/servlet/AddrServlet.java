package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.common.Common;
import com.service.AddrService;
import com.service.AddrServiceImpl;

@WebServlet(urlPatterns = {"/addr/*"})
public class AddrServlet extends HttpServlet {
	private static final long serialVersionUID = 1L; 
	private AddrService as = new AddrServiceImpl();
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter pw = response.getWriter();
		String cmd = Common.getCmd(request);
		String url = "/views/addr/" + cmd;
		if("list".equals(cmd)) {
			Map<String,String> address = new HashMap<>();
			request.setAttribute("list",as.selectAddrList(address));
			
			
		}else if("one".equals(cmd)) {
			
		}
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request, response);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
