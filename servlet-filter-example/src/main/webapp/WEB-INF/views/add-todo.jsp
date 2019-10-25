
<!DOCTYPE html>
<html>
<head>
<title>To-do List</title>
</head>
<body>

	<nav class="navbar navbar-default">
		<ul class="nav navbar-nav navbar-right">
			<li><a href="logout.do">Logout</a></li>
		</ul>
	</nav>
	
	<div class="container">
		<h1>Your New Action Item:</h1>
		<form method="POST" action="add-todo.do">
			 <label>New Todo :</label> <input name="todo" type="text" />
			 <input name="add" type="submit" />
		</form>
	</div>
	
</body>
</html>