<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="ab" class="com.user"></jsp:useBean>

<jsp:setProperty name="ab" property="*" />
<br>

<h1>Welcome to my website </h1><br>
name : <jsp:getProperty name="ab" property="fname" /> <br>
password : <jsp:getProperty name="ab" property="pass" />
<br>
</body>
</html>