<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Rooms</title>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
<link href="/temp.css" rel="stylesheet" /> 
</head>
<body>
	<div class="container">
		<h1>Progress Report</h1>
		<table class="table">
			<thead>
				<tr>
					<th>ID</th><th>Name</th><th>Type</th><th>Score</th><th>Total</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="grade" items="${grades}">
				<tr>
					<td>${grade.id}:</td>
					<td> ${grade.name}</td>
					<td>${grade.type}</td>
					<td>${grade.score }</td>
					<td>${grade.total }</td>
					<td><a href="/grades/delete?id=${grade.id}" >Delete</a></td>
				</tr>
				</c:forEach>
				
			</tbody>
		</table>
		<a href="/grades/add" class="btn btn-secondary">Add Grade</a>
	
	</div>
	
	<div>
	<p><h2> Score total: ${scoretotal} </h2><br>
	 <h2>Possible Points Total: ${total}</h2>
	</p>
	</div>
</body>
</html>