<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form name="updateform" action="updatedata" method="post">

id<input type="text" name="id" value="${id}">
Product Name<input type="text" name="pname" value="${pname}">
<input type="submit">
</form>
</body>
</html>