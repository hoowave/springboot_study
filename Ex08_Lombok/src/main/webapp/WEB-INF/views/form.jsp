<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Form 페이지</h1>
	<hr>
	<form action="login" method="get">
		<p>
			ID : <input type="text" name="id" placeholder="">
		</p>
		<p>
			PW : <input type="password" name="pw" placeholder="">
		</p>
		<p>
			<input type="submit" value="전송">
		</p>
	</form>
</body>
</html>