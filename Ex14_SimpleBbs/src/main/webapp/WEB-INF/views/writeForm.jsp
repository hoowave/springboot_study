<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>writeForm</title>
</head>
<body>
	<h1>Write Page</h1>
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
		<p>
			<input type="submit" value="글쓰기">
		</p>
	</form>
	<p>
		<a href="list">뒤로가기</a>
	</p>
</body>
</html>