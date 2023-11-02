<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>view</title>
</head>
<body>
	<h1>View Page</h1>
	<hr>
	<p>번호 : ${dto.id }</p>
	<p>작성자 : ${dto.writer }</p>
	<p>제목 : ${dto.title }</p>
	<p>내용 : ${dto.content }</p>
	<hr>
	<p>
		<a href="list">뒤로가기</a>
	</p>
</body>
</html>