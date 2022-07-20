<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to JSP </h1>

//String fname = request.getParameter("fname");
//out.print("Name is :" + fname + "<br>");
or

<%= "name is " + request.getParameter("fname") %>

<%=Calendar.getInstance().getTime() %>
<h2>i am h2 tag of html</h2>
</body>
</html>