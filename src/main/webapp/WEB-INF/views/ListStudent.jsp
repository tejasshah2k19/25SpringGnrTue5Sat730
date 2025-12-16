<%@page import="com.bean.StudentBean"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<h2>List Student</h2>

	<%
	List<StudentBean> students = (List<StudentBean>) request.getAttribute("students");
	%>
	<br><br>

	<table border="1" class="table table-bordered">
		<thead>
			<tr>
				<th>FirstName</th>
				<th>LastName</th>
				<th>Email</th>
			</tr>
		</thead>
		<tbody>

			<%
			for (StudentBean s : students) {
			%>
			<tr>
				<td><%=s.getFirstName()%></td>
				<td><%=s.getLastName()%></td>
				<td><%=s.getEmail()%></td>
			</tr>
			<%
			}
			%>
		</tbody>
	</table>


</body>
</html>