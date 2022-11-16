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
<form:form   action= "/save" method = "post" modelAttribute="courses">
		<input type="text" name="courseId" placeholder="id">
		 <input	type="text" name="courseName" >
		  <input type="text" name="duration">
		   <input type="text" name="fees"> 
		   <input type="submit" name="update" >
		   </form:form>
	

</body>
</html>