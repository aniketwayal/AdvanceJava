<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="index.jsp" method="post">
Enter name : <input type="text" name="fname"/>
<input type="submit" value="Click"/>
</form>


<%response.sendRedirect("https://www.youtube.com/"); %>
</body>
</html>