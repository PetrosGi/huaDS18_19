<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>test</title>
</head>
<body>

<h1>Provide user Information</h1>

	<form:form action="addUser" modelAttribute="user">
		<table border="1">
			<form:hidden name="id" path="id" />
			<tr>
				<td>First Name :</td>
				<td><form:input type="text" name="first_name" path="first_name"/></td>
			</tr>
			<tr>
				<td>Last Name :</td>
				<td><form:input type="text" name="last_name" path="last_name"
					/></td>
			</tr>
			<tr>
				<td>Email :</td>
				<td><form:input type="email" name="email" path="email" /></td>
			</tr>
			<tr>
				<td>Username :</td>
				<td><form:input type="text" name="username" path="username" /></td>
			</tr>
			<tr>
				<td>Password :</td>
				<td><form:input type="text" name="password" value="changeit"
					path="password" /></td>
			</tr>
			<tr>
				<td>Role :</td>
				<td><form:select name="roleId" path="roleId">
						<form:option value="role1" >1</form:option>
						<form:option value="role2">2</form:option>
				</form:select></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" name="submit" value="Add User"></td>
			</tr>

		</table>
	</form:form>
	<a href="listUsers">Go to list</a>
</body>
</html>