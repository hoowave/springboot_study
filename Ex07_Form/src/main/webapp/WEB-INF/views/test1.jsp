<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test1.jsp</title>
</head>
<body>
	<%
	out.print("#01 : Hello World");
	%>
	<br> 당신의 아이디는 ${id }입니다.
	<br> 당신의 이름은 ${name }입니다.
</body>
</html>