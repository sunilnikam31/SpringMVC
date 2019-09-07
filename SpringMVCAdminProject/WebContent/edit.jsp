<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
</head>
<body>
<form action="update">
<input type="hidden" name="rollno" value="${data.rollno}">
<table border="1">
<tr>
<td>Name:-</td>
<td><input type="text" name="name" value="${data.name}"></td>
</tr>
<tr>
<td>Address:-</td>
<td><input type="text" name="address" value="${data.address}"></td>
</tr>
<tr>
<td>Mobile:-</td>
<td><input type="text" name="mobile" value="${data.mobile}"></td>
</tr>
<tr>
<td>Email:-</td>
<td><input type="text" name="email" value="${data.email}"></td>
</tr>
<tr>
<td>Password:-</td>
<td><input type="text" name="password" value="${data.password}"></td>
</tr>
<tr>
<td><input type="submit" value="UPDATE"></td>
</tr>
</table>
</form>
</body>
</html>