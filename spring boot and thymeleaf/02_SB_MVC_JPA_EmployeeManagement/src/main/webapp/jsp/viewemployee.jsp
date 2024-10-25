<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script src="https://cdn.datatables.net/1.10.21/js/jquery.dataTables.min.js"></script>
<link href="https://cdn.datatables.net/1.10.21/css/jquery.dataTables.min.css"
	rel="stylesheet" type="text/css">

<script type="text/javascript">
	     $(document).ready(function() {
		$('#empTab').DataTable();
	});
</script>

</head>
<body>
	<!--  <h3>View Employee</h3>
<a href="loadForm">AddEmployess</a>-->
	<table class="table" id="empTab">
		<thead class="thead-dark">
			<tr>

				<th scope="col">Employee Number</th>
				<th scope="col">Employee name</th>
				<th scope="col">Employee Address</th>
				<th scope="col">Edit</th>
				<th scope="col">Delete</th>
			</tr>
		</thead>
		<tbody>
			
			<c:forEach items="${employees}" var="emp">
<tr>

					<td>${emp.eno}</td>
					<td>${emp.ename}</td>
					<td>${emp.eadd}</td>
				<td><a href="editstu?id=${emp.eno}">Edit</a></td>
      <td><a href="deletestu?id=${emp.eno}">Delete</a></td>
      
			</tr>
			</c:forEach>

		</tbody>
	</table>

</body>
</html>