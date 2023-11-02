<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Page</title>
</head>
<body>
	<h1>Create Page</h1>
	<hr>
	<%
	String conPath = request.getContextPath();
	%>
	<form action="<%=conPath%>/create" method="get">
		<p>
			작성자 : <input type="text" name="writer" value="${dto.writer }">
		</p>
		<p>
			내용 : <input type="text" name="content" value="${dto.content }">
		</p>
		<p>
			<input type="submit" value="전송">
		</p>
	</form>
</body>
</html>