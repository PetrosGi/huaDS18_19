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

<h1>Provide Role Information</h1>

	<form:form action="addRole" modelAttribute="role">
		<table border="1">
 			<form:hidden name="id" path="id" />
<!-- 			<form:hidden path="" value="${role.priv1}" id="priv1" />
			<form:hidden path="" value="${role.priv2}" id="priv2" />
			<form:hidden path="" value="${role.priv3}" id="priv3" />
			<form:hidden path="" value="${role.priv4}" id="priv4" />-->
			<tr>
				<td>Name :</td>
				<td><form:input name="role_name" path="role_name"/></td>
			</tr>
			<tr>
				<td>Privilege #1</td>
				<td><form:checkbox value="priv1" path="priv1"/></td>
			</tr>
			<tr>
				<td>Privilege #2</td>
				<td><form:checkbox value="priv2" path="priv2"/></td>
			</tr>
			<tr>
				<td>Privilege #3</td>
				<td><form:checkbox value="priv3" path="priv3"/></td>
			</tr>
			<tr>
				<td>Privilege #4</td>
				<td><form:checkbox value="priv4" path="priv4"/></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" name="submit" value="Submit"></td>
			</tr>

		</table>
	</form:form>
	<a href="listRoles">Go to list</a>
	
	
</body>
</html>
		