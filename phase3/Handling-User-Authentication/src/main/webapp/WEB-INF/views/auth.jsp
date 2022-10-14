<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> </title>
</head>
<body>

<h1 align="center" > Welcome to Authentication Page</h1>
<form action="Auth" method="post">
Username:<input type="text" name="username" />
Password:<input type="text" name="password" />

					<input type="submit" name="submit" />
					</form>
</body>
</html>