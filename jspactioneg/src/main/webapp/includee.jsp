<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.* " %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>I am using include </h1>
<br>
<jsp:include page="welcome.jsp"></jsp:include>
<br><br><br><br><br>
System date is : <%= new Date() %>
</body>
</html>