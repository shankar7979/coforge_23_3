package com.coforge.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.Stream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
//@WebServlet("/MyServlet1")
//@WebServlet("/UserData")
@WebServlet(urlPatterns = { "/UserData","/MyServlet1"})

public class MyServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	String country;
	
	@Override
	public void init() throws ServletException {
	System.out.println("init called"); 
	country="india";
	}
     //doGet
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 
		System.out.println("service called"); 
		PrintWriter out = response.getWriter();
		out.print("<br>My First servlet");
		
		String id = request.getParameter("id");
		String name = request.getParameter("name");
//		String hobby = request.getParameter("hobby");
		String hobby[] = request.getParameterValues("hobby");
		
		out.print("<br>Id is "+id);
		out.print("<br>Name is "+name);
		out.print("<br><br>Hobbies are  ");

		out.print("<ol>  ");
		
		for (String string : hobby) {
			out.print("<li>"+string);
		}
		
		out.print("</ol> <p>  <ul>");
		
		Stream.of(hobby).forEach(a->out.print("<li>"+a));
		out.print("</ul>");
		
		out.print("<br>Country is "+country);
		String qstring=request.getQueryString();
		
		out.print("<br> Query String  is "+qstring);
		
	}

	@Override
	public void destroy() {
		System.out.println("destroy called");
	}
	 
	
	
}
