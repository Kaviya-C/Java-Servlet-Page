package com.jsp;

public class IntroductionJSPVsSevlet 
{
	//  ---------------------------SERVLET --------------------------

	/*
	 * we have to create class
	 * extends the httpservlet
	 * give the name of the class
	 * create a method as doGet or doPost
	 * we have to pass the httpservletrequest and httpservletresponse object
	 * write our own logics inside this method
	 * create an object of PrintWriter
	 * import all the packages for request and response object
	 * 
	 * 
	 */
	
	// --------------------------- JSP  -----------------------------
	/*
	 * Java Servlet page
	 * here already predefined codes are there like html things 
	 * also request and response are there
	 * we no need to import or send 
	 * here we no need to create an object of printwriter
	 * everything is there and also here html tags are there
	 * so easily we can desgin our pages
	 * 
	 * INTERNALLY
	 * 
	 * JSP page is converted into Servlet
	 * 
	 * 
	 */
  
	
	//  ------------------------- COMPARISION --------------------------------
	
    /*
     * JSP              SERVLET
     * demo.jsp  -----  demojsp
     * 
     * <%   %>    ----  directly go to the service() 
     * 					method and also printwriter object
     * <%  %> --> this symbol is called ScriptLet 
     * 
     * 
     * 
     * if i want to create some variable above the service() method
     * <%!  %>  ---> declaration 
     * when we declare this above symbol mean 
     * whatever the code which is present outside of the
     * service() methods
     * EG: int i =10; ===> we can use this outside of the service() method
     * EG: exact jsp code is to be <%!  %> we use this to mention any variable if we want
     * show() method is created by outer of the service methods 
     * mention these methods are inside of <%!  %> in this tag
     * 
     * 
     * i want to import a package like Date Api
     * how can we do that?
     * <%@page import=" ","" %>   ---> directive  
     * in servlet the import statement is present outside 
     * of the class right
     * in JSP we have to use :
     * 			<%@page import="java.util.Date" %>
     * above is the equivalent code for importing in jsp
     * 
     *  if we have multiple imports needed for jsp then
     *  seperated by comma ,and then write the package
     *  java.util.collection.*  ,java.io.File , like this
     *  
     *  
     *  
     *  if i want to print something in jsp 
     *  servlet 		out.print(k);
     *  JSP      		<%=k%>    ---> Expression tag
     *  
     *  
     *  
     *  Overview of JSP 4 tags:
     *  
     *  <% %>	         	  ScriptLet tag    == inside of service() method logics here 
     *  <%! %>                Declaration tag  == outside of service() method like variable,
     *  											method initialization
     *  <%@page import= %>    Directive tag    == all the import statement here
     *  <%=variablename %>    Expression tag   ==  output can be written here
     *  
     *  
     *  
     *  -----------------------------JSP Directive----------------
     *  
     *  @page
     *  @include
     *  @taglib
     *  
     *  
     *  
     *  <%@ page attribute="value",attribute="value"...>
     *  attributes:
     *  		import ="importList"
     *          language ="scripting language"
     *          extends = "className"
     *          session ="true | false"
     *          autoFlush ="true | false"
     *          contentType = "ctinfo"
     *          errorPage = "error_url"
     *          isErrorPage ="true|false"
     *          info = "information"
     * Expression langugge
     *          isELIgnored = "true|false"
     *          isThreadSafe = "true|false"
     *          
     * 
     * ----------------------------@include ------------------------
     * <%@ include file="filename" %>
     * <%@ include file="header.jsp" %>
     * 
     * 
     * create one header.jsp  file inside add two number
     * <%=6+9%>
     * 
     * then go to home.jsp
     * <%@ include ="header.jsp" %>
     * 
     * above is the way to use include tag
     * 
     * ----------------------------@taglib---------------------------
     * 
     * this is the tag has syntax as:
     * 
     * <%@ taglib url ="uri" prefix="fx" %>
     * 
     * <kavi> is an invalid tag
     * <fx:h2> this is belongs to prefix of tablib
     * 
     * 
     * ---------------------Implicit Object in JSP-----------------
     * 
     * 			request
     * 			response
     *          pageContext
     *          servletConfig
     *          servletContext
     *          out
     *          session
     *          
     *          
     *  In servlet we have to create an request and response object
     *  In jsp we can directly take request object
     *  
     *  
     *  pageContext ---> refer page ---> it is an object
     *  we can set the attribute
     *  and also able to get the attribute
     *  pageContext.setAttribute("name","kaviya");
     *  by default its scope is that page
     *  by  default its stays in a page
     *  
     *  
     *  
     *  scope ---> session scope ---> anywhere we can access-->all the 5 pages
     *  if the session contains 5 pages we can access in all the 5 pages
     *  
     *  
     *  scope ---> request scope
     *  the page u requesting and data in the request page
     *  
     *  
     *  scope  ---> we can mention the scope 
     *             pageContex.setAttribute("name","kaviya","pageContext.SESSION_SCOPE ")  
     *          
     */
	
	
}

