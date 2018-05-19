<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="myServlet/HelloServlet">Get方式请求HelloServlet</a><br /><!-- 超链接访问的是Get方式 -->

<form action="hello" method="post">
<input type="submit" value="Post方式请求HelloServlet">
</form>
</body>
</html>