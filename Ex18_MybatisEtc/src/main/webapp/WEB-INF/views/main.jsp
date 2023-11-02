<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Main Page</title>
</head>
<body>
	<h1>Main Page</h1>
	<hr>
	<h3>List2</h3>
	<form action="list2" method="get">
		<p>
			Writer : <input type="text" name="writer">
		</p>
		<p>
			<input type="submit" value="검색">
		</p>
	</form>
	<hr>
	<h3>List3</h3>
	<form action="list3" method="get">
		<p>
			Writer : <input type="text" name="writer">
		</p>
		<p>
			Title : <input type="text" name="title">
		</p>
		<p>
			<input type="submit" value="검색">
		</p>
	</form>
	<hr>
	<h3>List4</h3>
	<form action="list4" method="get">
		<p>
			ID1 : <input type="text" name="id1">
		</p>
		<p>
			ID2 : <input type="text" name="id2">
		</p>
		<p>
			ID3 : <input type="text" name="id3">
		</p>
		<p>
			<input type="submit" value="검색">
		</p>
	</form>
	<hr>
	<a href="list">리스트페이지</a>
</body>
</html>