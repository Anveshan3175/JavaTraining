<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>

<form action="/smp/LoginServlet" method="post">
	<table>
		<tr>
			<td>User Name</td>
			<td><input type = "text" name ="loginName" id ="loginName" /></td>
		</tr>
		<tr>
			<td>Password</td>
			<td><input type ="password" name = "password" id = "password" /></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" Value="Login Here" /></td>
		</tr>
	</table>
</form>
</body>
</html>