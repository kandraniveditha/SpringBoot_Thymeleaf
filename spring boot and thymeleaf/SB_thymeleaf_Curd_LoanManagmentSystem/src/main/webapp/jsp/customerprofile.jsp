<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="customerheader.jsp"></jsp:include>
<div class="container mt-3 p-3 mb-2 bg-info text-black">
<h1>Customer Deatils</h1>
<table class="table">
<tbody>

<tr>
<td>Id</td>
<td>${customer.cid}</td>
</tr>

<tr>
<td>First name</td>
<td>${customer.fname}</td>
</tr>

<tr>
<td>Last name</td>
<td>${customer.lname}</td>
</tr>

<tr>
<td>Email</td>
<td>${customer.email}</td>
</tr>

<tr>
<td>Phone number</td>
<td>${customer.phonenum}</td>
</tr>

<tr>
<td>Gender</td>
<td>${customer.gender}</td>
</tr>

<tr>
<td>Marital Status</td>
<td>${customer.maritalstatus}</td>
</tr>

<tr>
<td>Profession</td>
<td>${customer.profession}</td>
</tr>

<tr>
<td>Address</td>
<td>${customer.address}</td>
</tr>

</tbody>

</table>

<a class="btn btn-primary" href="/viewcustomerupdate?id=${customer.cid}"> Update</a>



</div>
</body>
</html>