package com.web;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/HiServlet")
public class HiServlet extends GenericServlet {
	
	public void init() {
		System.out.println("init called ");
	}
	

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Inside Servlet \nHiServlet called");
	}

	
	public void destroy() {
		System.out.println("destroy HiServlet");
	}

}
