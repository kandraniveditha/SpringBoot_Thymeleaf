<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
<div class="container mt-2">
<h1>Customer Login Page</h1>
<font color="blue"${errorMessage}></font>
<form method="post">

Enter Email:<br>
<input type="text" name="email"><br>

Enter Password<br>
<input type="text" name="password"><br>

<input type="submit" value="login">
</form>
</div>
</body>
</html>