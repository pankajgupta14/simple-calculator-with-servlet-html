package com.calculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class calcultor extends HttpServlet {

	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 resp.setContentType("text/html");
		 PrintWriter out = resp.getWriter();
		 
		 String num1=req.getParameter("first-number");
		 String num2=req.getParameter("second-number");
		 String total=req.getParameter("factor");
		 
		 int a=Integer.parseInt(num1);
		 int b=Integer.parseInt(num2);
		 
		 int result =0;
		 
		 if (total.equals("+")) {
			    result = a + b;
			} else if (total.equals("-")) {
			    result = a - b;
			} else if (total.equals("*")) {
			    result = a * b;
			} else if (total.equals("/")) {
			    result = a / b;
			} else {
			    System.out.println("Invalid operator");
			    return; // Exit the calculation if the operator is invalid
			}

			out.println("The result is: " + result);
		 
		  
	}
}
