<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Userlist Page</h1>
	<hr>
	<c:forEach var="dto" items="${users }">
		<p>${dto.id } / ${dto.name }</p>
	</c:forEach>
</body>
</html>