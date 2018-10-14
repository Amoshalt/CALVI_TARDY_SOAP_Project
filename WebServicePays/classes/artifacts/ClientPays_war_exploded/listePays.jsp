<%@ page import="client.PaysServiceStub" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
	<title>Liste des pays</title>

	<jsp:include page='navbar.jsp'/>

</head>
<body>
	<div class="container">
		<h1>Liste des pays</h1>
		<h3>Sélectionnez la destination de vos rêves</h3>
		<table class="table table-hover">
			<thead>
			<th>Pays</th>
			<th>Continent</th>
			<th></th>
			</thead>
			<tbody>
			<%
				List<PaysServiceStub.Pays> list = (ArrayList<PaysServiceStub.Pays>)request.getAttribute("listePays");
				for (PaysServiceStub.Pays p : list) {
			%>
			<tr>
				<td>
					<%=p.getNomPays()%>
				</td>
				<td>
					<%=p.getNomContinent()%>
				</td>
				<td>
					<a href='pays?nom=<%=p.getNomPays()%>' style="text-decoration:none;">Rechercher  <span class="glyphicon glyphicon-search"></span></a>
				</td>
			</tr>
			<%
				}
			%>
			</tbody>
		</table>


	</div>
</body>
</html>