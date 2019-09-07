<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" />
<link rel="stylesheet" type="text/css" href="style/style.css">
<script type="text/javascript">
function addRegister() {
	document.fn.action="registration.jsp";
	document.fn.submit();
}
function deleteRegister() {
	document.fn.action="delete";
	document.fn.submit();
}
function editRegister() {
	document.fn.action="edit";
	document.fn.submit();
}
</script>
</head>
<body>
	<form name="fn">


		<table class="table">
		<tr>
			<th>Select</th>
			<th>Rollno</th>
			<th>Name</th>
			<th>Address</th>
			<th>Mobile</th>
			<th>Email</th>
			<th>Password</th>
			</tr>
			<tr>
				<c:forEach items="${data}" var="r">
					<td><input type="radio" name="rollno" value="${r.rollno}"></td>
					<td>${r.rollno}</td>
					<td>${r.name}</td>
					<td>${r.address}</td>
					<td>${r.mobile}</td>
					<td>${r.email}</td>
					<td>${r.password}</td>
			</tr>
			</c:forEach>

		</table>

<table class="table">
<tr>
<td><input type="button" value="ADD" onclick="addRegister()"></td>
<td><input type="button" value="EDIT" onclick="editRegister()"></td>
<td><input type="button" value="DELETE" onclick="deleteRegister()"></td>

</tr>
</table>
	</form>
</body>
</html>