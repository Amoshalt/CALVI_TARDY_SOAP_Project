<%@ page import="client.PaysServiceStub" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%
	PaysServiceStub.Pays pays = (PaysServiceStub.Pays) request.getAttribute("pays");
%>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
	<title><%=pays.getNomPays()%></title>


</head>
<body>
	<jsp:include page='/navbar.jsp'/>
	<div class="container">
	<a type="button" href="listePays" class="btn btn-info">Retour liste</a>

		<h1><%=pays.getNomPays()%></h1>

		<table class="table table-hover">
			<tbody>
				<tr>
					<td>
						Continent
					</td>
					<td>
						<%=pays.getNomContinent()%>
					</td>
				</tr>
				<tr>
					<td>
						Capitale
					</td>
					<td>
						<%=pays.getNomCapitale()%>
					</td>
				</tr>
				<tr>
					<td>
						Nombre d'habitants:
					</td>
					<td>
						<%=pays.getNbHabitants()%>
					</td>
				</tr>
			</tbody>
			<tfoot>
				<div>
						<iframe
								width="100%"
								height="600"
								frameborder="0"
								style="border:0;"
								src="https://www.google.com/maps/embed/v1/place?key=AIzaSyC6MzrLaRehfQ6uWISRpEC52GuE7dYX22Q
					&q=<%=pays.getNomCapitale()%>,<%=pays.getNomPays()%>"
								allowfullscreen>
						</iframe>
				</div>
			</tfoot>
		</table>




	</div>
</body>
</html>