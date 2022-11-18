<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Course Details</title>
</head>
<body>
	<h1 align="center" style ="text-decoration:underline ;color : orange;font-style:italic">
	The Global Education center</h1>
    <br>
    <h3 align ="center" style=" font-style:italic"><a href="/add" class="btn btn-sm btn-danger">
    Create new courses</a></h3>
    
	<div align="center">
		<table border="2" width="70%" cellpadding="2">
			<thead>
				<tr>
					<th>CODE</th>
					<th>NAME</th>
					<th>DURATION(in months)</th>
					<th>FEES</th>
					<th>ACTIONS</th>
				</tr>
			</thead>
			<tbody style="text-align:center">
			<c:forEach var="course" items="${courses}">
				<tr>
					<td>${course.courseId}</td>
					<td>${course.courseName}</td>
					<td>${course.duration}</td>
					<td>${course.fees}</td>
					<td><a href="/edit?id=${course.courseId}" class="btn btn-sm btn-danger">edit</a>
					<a href="deleteCourse?id=${course.courseId}" class="btn btn-sm btn-danger">Remove</a>
					
					</td>
				</tr>

			</c:forEach>
			</tbody>

		</table>
	</div>
</body>
</html>