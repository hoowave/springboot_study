<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>RegForm</h1>
	<hr>
	<form action="reg" method="post">
		<p>
			제목 : <input type="text" name="title">
		</p>
		<p>
			내용 : <input type="text" name="content">
		</p>
		<p>
			작성자 : <input type="text" name="writer">
		</p>
		<p>
			<input type="submit" value="등록">
		</p>
	</form>
</body>
</html>