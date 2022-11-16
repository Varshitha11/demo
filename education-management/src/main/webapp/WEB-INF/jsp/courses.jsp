<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">education-management</h1>

	<div align="center">
		<table border="2" width="70%" cellpadding="2">
			<thead>
				<tr>
					<th>CODE</th>
					<th>NAME</th>
					<th>Duration</th>
					<th>fees</th>
					<th>ACTIONS</th>
				</tr>
			</thead>
			<c:forEach var="course" items="${courses}">
				<tr>
					<td>${course.courseId}</td>
					<td>${course.courseName}</td>
					<td>${course.duration}</td>
					<td>${course.fees}</td>
					<td><a href="deleteCourse?id=${course.courseId}" class="btn btn-sm btn-danger">delete</a></td>
				</tr>

			</c:forEach>

		</table>
	</div>
</body>
</html>