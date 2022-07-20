<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%= "name is " + request.getParameter("fname") %> 
<br>
<%out.println("welcome......."); %>


<form action="login.jsp">
<input type="text" />
<input type="submit" value="click">
</form>

</body>
</html>