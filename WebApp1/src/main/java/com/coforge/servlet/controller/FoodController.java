package com.coforge.servlet.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
@WebServlet("/FoodController")
public class FoodController extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		PrintWriter writer = response.getWriter();
	
		String type = request.getParameter("type");
		
		RequestDispatcher dispatcher;
		
		if(type.equals("nindian")){
			
	dispatcher=request.getRequestDispatcher("/view/north_food.jsp");
	dispatcher.forward(request, response);		
			
		}
		
		if(type.equals("sindian")){
			
			dispatcher=request.getRequestDispatcher("/view/south_food.jsp");
			dispatcher.forward(request, response);		
			
		}
		
	}
 

}
