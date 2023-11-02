<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Write Form Page</h1>
	<hr>
	<form action="write" method="post">
		<p>
			작성자 : <input type="text" name="writer">
		</p>
		<p>
			제목 : <input type="text" name="title">
		</p>
		<p>
			내용 : <input type="text" name="content">
		</p>
		<input type="submit" value="등록">
	</form>
	<hr>
	<h1>Write Form Page2</h1>
	<form action="write2" method="post">
		<p>
			작성자 : <input type="text" name="writer">
		</p>
		<p>
			제목 : <input type="text" name="title">
		</p>
		<p>
			내용 : <input type="text" name="content">
		</p>
		<input type="submit" value="등록">
	</form>
	<p>
		<a href="list">목록보기</a>
	</p>
</body>
</html>