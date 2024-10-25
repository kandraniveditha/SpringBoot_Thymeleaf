<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script
	src="https://cdn.datatables.net/1.10.21/js/jquery.dataTables.min.js"></script>
<!-- //cdn.datatables.net/1.10.21/css/jquery.dataTables.min.css
 --><link href="https://cdn.datatables.net/1.10.21/css/jquery.dataTables.min.css"
	rel="stylesheet" type="text/css">
<script>
$(document).ready(function() {
	$('#stuTab').DataTable({
		"pagingType" : "full_numbers"
	});
});
</script>
<!-- <script>
	function deleteConfirm(){
	var c=confirm("Are you sure, you want to delete?")
	console.log(c);
		return c;
	}
</script>
 -->
</head>
<body>
<h3>View  Books</h3>
<a href="loadForm">Add New Book</a> 
<table class="table" id="stuTab">
		<thead class="thead-dark">
			<tr>

				<th scope="col">Book Id</th>
				<th scope="col">Book name</th>
				<th scope="col">Author Name</th>
				<th scope="col">Book Price</th>
				<th scope="col">Edit</th>
				<th scope="col">Delete</th>
			</tr>
		</thead>
		<tbody>

<c:forEach items="${books}" var="b">
<tr>
<td>${books.bookid}</td>
<td>${books.bookname}</td>
<td>${books.authorname}</td>
<td>${books.bookprice}</td>
  <td><a href="editstu?id=${books.bookid}">Edit</a></td>
     <td><a href="deleteBook?id=${books.bookid}" onclick="deleteConfirm()">Delete</a>

</tr>
</c:forEach>

</tbody>

</table>
</body>
</html>