<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>edit course</title>

</head>
<body>
	<h2 align="center" style="color: orange; font-style: italic">Edit
		Course Fee And Duration</h2>
	<h4 align="center" style="color: red">* marked items entry is
		compulsory</h4>
	<div align="center">
		<form:form action="/save" method="post" modelAttribute="courses">
			<table>
				<tr>
					<td>The Course Number:</td>
					<td><input type="text" name="courseId" readonly="readonly"
						value="${courses.courseId}"></td>
				</tr>
				<tr>
					<td>The course Name:</td>
					<td><input type="text" name="courseName" readonly="readonly"
						value="${courses.courseName}"></td>
				</tr>
				<tr>
					<td>*Enter New Duration:</td>
					<td><input type="text" name="duration"
						value="${courses.duration}"></td>
				</tr>
				<tr>
					<td>*Enter New Fees:</td>
					<td><input type="text" name="fees" value="${courses.fees}">
					</td>
				</tr>
			</table>
			<input type="submit" name="update">
		</form:form>

	</div>


</body>
</html>