<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
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

<h1>Admin Login Page</h1>
<font color="blue"${errorMessage}></font>
<form method="post">

Enter Email:<br>
<input type="text" name="email"><br>

Enter Password<br>
<input type="text" name="password"><br>

<input type="submit" value="login">
</form>
</body>
</html>