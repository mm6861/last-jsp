package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/views/*")
public class ViewResolverServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String PREFIX = "/WEB-INF";
	private static final String SUFFIX = ".jsp";
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		uri = PREFIX + uri + SUFFIX;
		RequestDispatcher rd = request.getRequestDispatcher(uri);
		response.setContentType("text/html;charset=utf-8");
		rd.forward(request, response);
//		PrintWriter pw = response.getWriter();
//		pw.println("나나나");
//		pw.println("흐규규");
//		pw.println("스멜~");
//		pw.close();
//		RequestDispatcher rd = request.getRequestDispatcher("/test.jsp");
//		rd.forward(request, response);
		//		PageContext pc = request.getServletContext()
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
