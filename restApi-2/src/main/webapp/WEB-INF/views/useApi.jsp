<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Use Api</h1>
	<hr>
	<h3>목록보기</h3>
	<button id="btn_list">목록가져오기</button>
	<div id="div_list"></div>
</body>
<script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<script>
	$("#btn_list").click(function() {
		$("#div_list").html("");
		$.ajax({
			url : "http://localhost:8089/members",
			type : "GET",
			dataType : "json",
			success : function(resp) {
				console.log(resp);
				for (let i = 0; i < resp.length; i++) {
					$("#div_list").append("<p>" + resp[i].name + "</p>");
				}
			},
			error : function(error) {
				console.log(error);
			}
		})
	})
</script>
</html>