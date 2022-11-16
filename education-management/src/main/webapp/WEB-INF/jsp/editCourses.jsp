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

	<form:form   action= "/save" method = "post" modelAttribute="courses">
		<input type="text" name="courseId" readonly="readonly" value="${courses.courseId}">
		 <input	type="text" name="courseName"  readonly="readonly" value="${courses.courseName}">
		  <input type="text" name="duration"  value="${courses.duration}">
		   <input type="text" name="fees"   value="${courses.fees}"> 
		   <input type="submit" name="update" >
		   </form:form>
	

</body>
</html>