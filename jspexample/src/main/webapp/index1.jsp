<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! int number = 100; %>
<%= "value is :"+ number %>
<br>
<%!
double area(int r){
	double pi = 3.14;
	return r*r*pi;
}
%>
<%="area is :" +area(6) %>
</body>
</html>