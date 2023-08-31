<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body {
	color: white;
	font-size: 40px;
	font-style:italic;
}
</style>
</head>
<body bgcolor="grey">
	<%
	int num1 = Integer.parseInt(request.getParameter("no1"));
	int num2 = Integer.parseInt(request.getParameter("no2"));

	int addition = num1 + num2;

	out.println("Addition of Two number: " + addition);
	%>

</body>
</html>