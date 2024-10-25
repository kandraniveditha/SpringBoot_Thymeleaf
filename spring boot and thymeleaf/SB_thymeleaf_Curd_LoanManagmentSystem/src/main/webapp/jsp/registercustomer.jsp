<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>


<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

</head>

<style>
input[type=text],select {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display:inline-block;
  border:1px solid #CCC;
  border-radius:2px;
  box-sizing: border-box;
}
input[type=password],select {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display:inline-block;
  border:1px solid #CCC;
  border-radius:2px;
  box-sizing: border-box;
}

input[type=submit] {
  width: 100%;
  background-color:lightblue;
  color:white;
  padding: 12px 20px;
  margin: 8px 0;
  display:inline-block;
  border:1px solid #CCC;
  border-radius:4px;
  cursor:pointer;
  }
  
 input[type=submit]:hover {
 background-color:#FF0000;
 }
  
</style>


<body>
<jsp:include page="customerheader.jsp"></jsp:include>
<div class="container p3 mb-2 bg-success text-white">
<h1>Customer Registration</h1>
<form model="post">
Enter Customer First Name:<br>
<input type="text" name="fname"><br>
Enter Customer Last name:<br>
<input type="text" name="lname"><br>
Enter Customer Email:<br>
<input type="text" name="email"><br>
Enter Customer Email:<br>
<input type="text" name="email"><br>
Enter Customer Password:<br>
<input type="text" name="password"><br>
Enter Customer Phone number:<br>
<input type="text" name="phonenum"><br>
Enter Customer Gender:<br>
<input type="text" name="gender"><br>
Enter Customer Marital Status:<br>
<input type="text" name="martialstatus"><br>
Enter Customer Profession:<br>
<input type="text" name="profession"><br>
Enter Customer Address:<br>
<input type="text" name="address"><br>

<input type="submit" value="Register">
</form>

</div>
</body>
</html>