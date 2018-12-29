<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>List of students</h1>

<table border="1">
<tr>
<th>Student ID</th>
<th>First name</th>
<th>Last name</th>
<th>Email</th>
<th>Registration Year</th>
<th>Remaining classes</th>
<th>Action</th>
</tr>
<c:forEach items="${student}" var="student">
	
	<tr>
	<td>${student.sid}</td>
	<td>${student.first_name}</td>
	<td>${student.last_name}</td>
	<td>${student.email}</td>
	<td>${student.registration_year}</td>
	<td>${student.remaining_classes}</td>
	<td>
		dosthing|dosthingelse
	</td>
	</tr>
</c:forEach>

</table>

</body>
</html>