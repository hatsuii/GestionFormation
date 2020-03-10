<%@ page import="client.*"%>
<%@ page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Formations</title>
</head>
<body>
	<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
		integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
		integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
		integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
		crossorigin="anonymous"></script>
		
	<nav class="navbar navbar-expand-lg navbar-light bg-warning"> <a
		class="navbar-brand" href="#"></a>
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarNav" aria-controls="navbarNav"
		aria-expanded="false" aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>
	<div class="collapse navbar-collapse" id="navbarNav">
		<ul class="navbar-nav">
			<li class="nav-item active"><a class="nav-link" href="#">Home
					<span class="sr-only">(current)</span>
			</a></li>
			<li class="nav-item active"><a class="nav-link" href="#"
				onclick="document.location.href='index.jsp';">Ajouter
					une formation</a></li>
			<li class="nav-item active"><a class="nav-link" href="#"
				onclick="document.location.href='';">Supprimer une formation</a>
			</li>
			<li class="nav-item active"><a class="nav-link" href="#"
				onclick="document.location.href='listeFormation.jsp';">Liste formation</a>
			</li>
		</ul>
	</div>
	</nav>
	<h2>Liste des formations</h2>
	<br>
	<%!FormationServiceService fss = new FormationServiceService();%>
	<%!IFormationService port = fss.getFormationServicePort();%>


	<%
		List<Formation> maListeEtudiant = port.lireTouteFormation();
	%>
	<%
		for (int i = 0; i < maListeEtudiant.size(); i++) {
	%>
	<tr>
		<th scope="row"></th>
		<td>
			<%
				out.println(maListeEtudiant.get(i).getId());
			%>
		</td>
		<td>
			<%
				out.println(maListeEtudiant.get(i).getTheme());
			%>
		</td>
		<br>
		<%
			}
		%>
		<br>
		<button class="btn btn-primary" href="#"
			onclick="document.location.href='index.jsp';">retour</button>
</body>
</html>