package com.jsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SampleAddition extends HttpServlet 
{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		int num1 = Integer.parseInt(request.getParameter("no1"));
		int num2 = Integer.parseInt(request.getParameter("no2"));
		
		int addition =num1 + num2;
		
		PrintWriter out = response.getWriter();
		 out.println(addition);
		
		
		/*
		 * If u want to design the output page we are not able
		 *  to done everything in the out.println
		 *  
		 *  this is too tedious process
		 *  
		 *  bcoz we are use different designs for formatting the pages
		 *  everything we put inside the tag is not good and also it is design 
		 *  part so java developer hesitate to do this stuff
		 *  
		 *  they are know only backend technology
		 *  
		 *  offcourse there is a solution
		 *  
		 *  JSP comes as a solution for this  problem
		 *  
		 *  JSP  stands for Java Server Page
		 *  
		 *  
		 */
		
		/*
		 * all the html tags are converted as 
		 * out.write html tags in the servlet
		 */
	}

}
