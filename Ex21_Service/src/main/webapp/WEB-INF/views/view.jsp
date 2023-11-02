<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>View Page</h1>
	<hr>
	<p>제목 : ${dto.title }</p>
	<p>내용 : ${dto.content }</p>
	<p>
		<a href="list">목록보기</a>
	</p>
</body>
</html>