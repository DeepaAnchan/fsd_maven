
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<title>To-do list</title>
</head>
<body>
	<nav class="navbar navbar-default">
		<ul class="nav navbar-nav navbar-right">
			<li><a href="logout.do">Logout</a></li>
		</ul>
	</nav>
	
	<div class="container">
		<h1>Welcome ${name}</h1>
		<h2>Your To-do list  is:</h2>
		
		<ol>		
			<c:forEach items="${todos}" var="todo">
				<li>${todo.name}&nbsp;<a href="delete-todo.do?todo=${todo.name}">Delete</a></li>
			</c:forEach>
		</ol>
		<p>
			<font color="red">${errorMessage}</font>
		</p>
		<a href="add-todo.do">Add New Todo</a>
	</div>
	
</body>
</html>