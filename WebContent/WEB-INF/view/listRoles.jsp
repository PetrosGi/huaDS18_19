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
<h1>List of roles</h1>
<p>
	<button onclick="window.location.href = 'adminRoleAdd'"; return=false;>Add Role</button>
</p>
<table border="1">
<tr>
<th>Name</th>
<th>Privilege #1</th>
<th>Privilege #2</th>
<th>Privilege #3</th>
<th>Privilege #4</th>
<th>Action</th>
</tr>
<c:forEach items="${role}" var="r">
	<c:url var="edit" value="adminRoleEdit">
		<c:param name="rId" value="${r.id}"></c:param>
	</c:url>
	<c:url var="delete" value="roleDelete">
		<c:param name="rId" value="${r.id}"></c:param>
	</c:url>
	<tr>
	<td>${r.role_name}</td>
	<td>${r.priv1}</td>
	<td>${r.priv2}</td>
	<td>${r.priv3}</td>
	<td>${r.priv4}</td>
	<td>
		<a href="${edit}"> Edit</a> | <a href="${delete}"> Delete</a>
	</td>
	</tr>
</c:forEach>

</table>

</body>
</html>