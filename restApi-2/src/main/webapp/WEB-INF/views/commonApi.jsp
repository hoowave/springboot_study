<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>공공데이터 - 공영주차장 정보</h1>
	<hr>
	<button onclick="f()">실행</button>
</body>
<script>
	function f() {
		var xhr = new XMLHttpRequest();
		var url = 'http://apis.data.go.kr/6260000/BusanPblcPrkngInfoService/getPblcPrkngInfo'; /*URL*/
		var queryParams = '?'
				+ encodeURIComponent('serviceKey')
				+ '='
				+ 'imXXm%2BLh3dotmxheNARbo8u5Xtuxb4XDPdquwpY0vgQFjs53Is7ofsYZLYly4YMKOjjlafy743m4FqBG%2F7ar5w%3D%3D'; /*Service Key*/
		queryParams += '&' + encodeURIComponent('pageNo') + '='
				+ encodeURIComponent('1'); /**/
		queryParams += '&' + encodeURIComponent('numOfRows') + '='
				+ encodeURIComponent('10'); /**/
		queryParams += '&' + encodeURIComponent('resultType') + '='
				+ encodeURIComponent('json'); /**/
		xhr.open('GET', url + queryParams);
		xhr.onreadystatechange = function() {
			if (this.readyState == 4) {
				alert('Status: ' + this.status + 'nHeaders: '
						+ JSON.stringify(this.getAllResponseHeaders())
						+ 'nBody: ' + this.responseText);
			}
		};
		xhr.send('');
	}
</script>
</html>