<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
session.invalidate();
response.setHeader("cache-control","no-cache");
response.setHeader("cache-control","no-store");
response.setDateHeader("Expire",-1);
response.setHeader("pragma","no-cache");
   RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
   rd.forward(request, response);

%>
</body>
</html>