package com.umut;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		
		PrintWriter writer = res.getWriter();
		String username= (String) req.getParameter("username");
		String password = (String) req.getParameter("password");
		
		System.out.println(username+password);
		
		if(username != null && password != null) {
			writer.println("Login success");
			req.getSession().setAttribute("token", "487239847239");
			req.getSession().setMaxInactiveInterval(10);
			return;
		}
		
		System.out.println("LoginServlet works");
		
		writer.print("Please use correct credentials to log in succesfully");
		
		
	}
}
