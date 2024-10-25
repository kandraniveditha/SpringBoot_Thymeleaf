<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>

<div class="container">

<div class ="card">
<div class="card-header">
<h1 style="text-align:center; color:blue;">Book Form</h1>
</div>
<h3>Add Book</h3>
<p>${msg}</p>
<form:form action="addBook" modelAttribute="book" >

<div class="form-group">
<label for="bookname">
Book Name
</label>
<form:input path="bookname" name="bookname" class="form-control" id="bookname" placeHolder="EnetrBookName"/>
</div>

<div class="form-group">
<label for="authorname">
Author Name
</label>
<form:input path="authorname" name="authorname" class="form-control" id="authorname" placeHolder="EnetrAuthorName"/>
</div>

<div class="form-group">
<label for="bookprice">
Book Price
</label>
<form:input path="bookprice" name="bookprice" class="form-control" id="bookprice" placeHolder="EnetrBookPrice"/>
</div>

<button type="reset" class="btn-btn-primary">Reset</button>
<button type="submit" class="btn-btn-primary">Submit</button>

<a href="viewBooks">ViewAllBooks</a>

</form:form>
</div>
</div>


</body>
</html>