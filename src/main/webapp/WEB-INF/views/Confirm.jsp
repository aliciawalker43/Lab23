<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add A Grade</title>
</head>
<body>
<p> The grade was added to the database. </p>

<h3> Details</h3>

<p>
<li>  Assignment ID :${id} </li>
<li>  Name Assignment :<c:out value = " ${ name }"/> </li>
<li>  Type Assignment: <c:out value = "${type }"/> </li>
<li>  Score : ${score }</li>
<li>  Total: ${ total}</li>
</p>
<a href="/" class="btn btn-secondary">Return to Grade list.</a>
</body>
</html>