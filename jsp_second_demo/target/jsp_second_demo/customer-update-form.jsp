    <%@ page import="comm.example.model.Customer"%>
<!DOCTYPE html>
<html>

<head>
	<title>Save Customer</title>

	
</head>

<body>
	
	<div id="wrapper">
		<div id="header">
			<h2>CRM - Customer Relationship Manager</h2>
		</div>
	</div>

	<div id="container">
		<h3>Save Customer</h3>
	
		<form action="controller.do" method="POST">
			<p>${customer2}</p>
			<table>
				<tbody>
					<tr>
						<td><label>First name:</label></td>
						<td><input name="fName" type="text" value="${customer2.firstName}" /></td>
					</tr>
				
					<tr>
						<td><label>Last name:</label></td>
						<td><input name="lName" type="text" value="${customer2.lastName}"/></td>
					</tr>

					<tr>
						<td><label>Email:</label></td>
						<td><input name="email" type="text" value="${customer2.email}"/></td>
					</tr>

					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Update" class="save" /></td>
					</tr>

				
				</tbody>
			</table>
		
		
		</form>
	
		<div style="clear; both;"></div>
		
		<p>
			<a href="list.do">Back to List</a>
		</p>
	
	</div>

</body>

</html>
