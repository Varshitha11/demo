<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>add new course</title>
</head>
<body>
	<h2 align="center">Add New Course</h2>
	<h4 align="center">* marked items entry is compulsory</h4>
	<div align="center">
		<form:form action="/save" method="post" modelAttribute="courses">

			<table>
				<tr>
					<td>The Course Number:</td>
					<td><input type="text" name="courseId"></td>
				</tr>
				<tr>
					<td>The course Name:</td>
					<td><input type="text" name="courseName"></td>
				</tr>
				<tr>
					<td>*Enter New Duration:</td>
					<td><input type="text" name="duration"></td>
				</tr>
				<tr>
					<td>*Enter New Fees:</td>
					<td><input type="text" name="fees"></td>
				</tr>

			</table>

			<input type="submit" name="add">
			
		</form:form>
	</div>


</body>
</html>