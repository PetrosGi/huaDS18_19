<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>List of students</h1>
<p>
	<button onclick="window.location.href = 'adminUserAdd'"; return=false;>Add User</button>
</p>
<table border="1">
<tr>
<th>First name</th>
<th>Last name</th>
<th>Email</th>
<th>Username</th>
<th>Role</th>
<th>Action</th>
</tr>
<c:forEach items="${user}" var="u">
	<c:url var="edit" value="adminUserEdit">
		<c:param name="uId" value="${u.id}"></c:param>
	</c:url>
	<c:url var="delete" value="userDelete">
		<c:param name="uId" value="${u.id}"></c:param>
	</c:url>
	<tr>
	<td>${u.first_name}</td>
	<td>${u.last_name}</td>
	<td>${u.email}</td>
	<td>${u.username}</td>
	<td>${u.roleId}</td>
	<td>
		<a href="${edit}"> Edit</a> | <a href="${delete}"> Delete</a>
	</td>
	</tr>
</c:forEach>

</table>

</body>
</html>