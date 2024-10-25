<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<jsp:include page="adminHeader.jsp"></jsp:include>
<div class="container mt-3 p-3 mb-2 bg-info text-black">
<h1>Loan Customer Details</h1>
<table class="table">
<thead>
<tr>
<th>Customer Id</th>
<th>First Name</th>
<th>Last Name</th>
<th>Email</th>
<th>Password</th>
<th>DOB</th>
<th>Phone number</th>
<th>Gender</th>
<th>Marital Status</th>
<th>profession</th>
<th>Address</th>
<th>Update</th>
<th>Delete</th>
</tr>
</thead>

<tbody>
<c:forEach items="${customers}" var="cust">

<tr>
<td>${cust.cid}</td>
<td>${cust.fname}</td>
<td>${cust.lname}</td>
<td>${cust.email}</td>
<td>${cust.password}</td>
<td>${cust.dob}</td>
<td>${cust.phonenum}</td>
<td>${cust.gender}</td>
<td>${cust.maritalstatus}</td>
<td>${cust.profession}</td>
<td>${cust.address}</td>

<td><a class="btn btn-primary" href="/view-update?id=${cust.cid}>Upadte</a></td>

<td><a class="btn btn-primary" href="/update-delete?id=${cust.cid}>Delete</a></td>



</tr>
</c:forEach>
</tbody>
</table>


<div><a class="btn btn-primary" href="/customer">ADD Customer</a>
<div><a class="btn btn-primary" href="/searchcustomer">Search Customer</a>
</div>

</body>
</html>
