<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<form action="login.do" method="post">
			<label for="input-1">User Name:</label>
			<input id="input-1" name="uName" placeholder="user name" type="text"/>
			<br/>
			<label for="input-2">Password</label>
			<input id="input-2" name="uPassword" placeholder="password"  type="password"/>
			<br/>
			<input type="submit" value="Login"/>
		</form>
	</body>
</html>