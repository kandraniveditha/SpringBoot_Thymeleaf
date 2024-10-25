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

<h3>Edit Book</h3>
<form:form action="editBook" modelAttribute="book" method="post">

<table>
<tr>
<form:hidden path="bookid"/>
<td>
Book Name :
</td>
<td>
<form:input path="bookname"/>
</td>

</tr>

<tr>
<td>
Author Name :
</td>
<td>
<form:input path="authorname"/>
</td>

</tr>

<tr>
<td>
Book Price :
</td>
<td>
<form:input path="bookprice"/>
</td>

</tr>
<tr>
 <td><input type="submit" value="Edit Save" /></td>  

</tr>
</table>


</form:form>

</body>
</html>