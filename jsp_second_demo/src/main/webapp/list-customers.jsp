
<!DOCTYPE html>



<%@ page contentType="text/html" isELIgnored="false"%>
<%@page import="java.util.List"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html" isELIgnored="false"%>
<html lang="en">
<head>
<title>list all customer</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">

</head>
	
<body>


	<div id="wrapper">
		<div id="header">
			<h2>CRM - Customer Relationship Manager</h2>
		</div>
	</div>

	<div id="container">

		<div id="content">


			<input type="button" value="Add Customer"
				onclick="window.location.href='add-customer.jsp'; return false;"
				class="add-button" />
		</div>
	</div>
	<div>
			<form action="SearchServlet.do">

				<input name="search" type="text" /><input type="submit"
					value="search">
			</form>
	</div>
	<div>
			<form action="SortServlet.do">
				<select name="Sort">
					<option value="ASC">Ascending</option>
					<option value="DESC">Descending</option>
				</select>
				<input type="submit" value="search">
			</form>
	</div>
	<div class="container">
		<h2>Customer Details</h2>

		<table class="table table-striped">
			<thead>
				<tr>
					<th>#</th>
					<th>Firstname</th>
					<th>Lastname</th>
					<th>Email</th>
					<th>Action</th>


				</tr>
			</thead>
			<tbody>
			
		
					 <c:forEach var="tempCustomer" items="${customers}">
					 		
						     <tr>		
						     	<td>${tempCustomer.id}</td>						     	        
							     <td>${tempCustomer.firstName}</td>
							     <td>${tempCustomer.lastName}</td>
							     <td>${tempCustomer.email}</td>
							     <td><a href='
									<c:url value="delete.do">
										<c:param name="CustomerId" value="${tempCustomer.id }"></c:param>								
									</c:url>
									'>Delete</a>
									<a href='
									<c:url value="Update.do">
										<c:param name="CustomerId2" value="${tempCustomer.id }"></c:param>								
									</c:url>
									'>Update</a></td>
						     </tr>    
    				 </c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>