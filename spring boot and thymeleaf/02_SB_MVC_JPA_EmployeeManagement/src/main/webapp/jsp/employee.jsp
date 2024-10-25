<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Management System</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

</head>
<body>

<div class="container">

<div class ="card">
<div class="card-header">
<h1 style="text-align:center">Employee Login Form</h1>
</div>

<div class="card-body">
${msg}
<form:form action="insert" modelAttribute="emp">

<div class="form-group">
<label for="ename">
Employee Name
</label>
<form:input path="ename" name="ename" class="form-control" id="ename" placeHolder="EnetrEmployeeName"/>
</div>

<label for="eadd">
Employee Address
</label>
<form:input path="eadd" name="eadd" class="form-control" id="eadd" placeHolder="EnetrEmployeeAddress"/>
</div>

<button type="submit" class="btn-btn-primary">Submit</button>

</form:form>

<a href="viewEmployee">View Employee</a>
</div>
</div>





</body>
</html>