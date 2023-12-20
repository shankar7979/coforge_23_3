package com.coforge.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EmployeeOperation")
public class EmployeeOperation extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	Connection connection;
	Statement statement;
	ResultSet resultSet;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			 connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/coforge", "root", "mysql");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String search = request.getParameter("search");
		if (search.equals("id")) {
			int id = Integer.parseInt(request.getParameter("id"));
		}

		if (search.equals("all")) {

		}

	}

}
