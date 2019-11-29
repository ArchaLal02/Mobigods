<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:if test="${not empty studentlist }">
<table>
<tr>
<th>ID</th>
<th>Name</th>
<th>ADDRESS</th>
<th></th><th></th>
</tr>
<c:forEach items="${studentlist }" var="student">
<tr>
<td>${student.id }</td>
<td>${student.name }</td>
<td>${student.address }</td>
<td><a href="edit?id=${student.id }&name=${student.name}&address=${student.address}">Update</a></td>
<td><a href="deletedata?id=${student.id }">Delete</a></td>
</tr>
</c:forEach>
</table>
</c:if>
</body>
</html>