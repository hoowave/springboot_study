<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>List Page(전체게시글 수 : ${totalCnt })</h1>
	<hr>
	<table border="1">
		<thead>
			<tr>
				<td>id</td>
				<td>writer</td>
				<td>title</td>
				<td>delete</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="dto" items="${list }">
				<tr>
					<td>${dto.id }</td>
					<td>${dto.writer }</td>
					<td><a href="view?id=${dto.id }">${dto.title }</a></td>
					<td><a href="delete?id=${dto.id }">X</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>


	<p>
		<a href="writeForm">글작성</a>
	</p>

</body>
</html>