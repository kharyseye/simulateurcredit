<%@page import="model.CreditModel"%>
<%
CreditModel model = (CreditModel) request.getAttribute("creditModel");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Simulateur de credit</title>
<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css" />
<link rel="stylesheet" href="css/style.css" type="text/css" />

</head>
<body>
	<div class="container">
		<div class="card col-md-6">
		<form action="controleur" method="post">
			<fieldset >
				<legend class="card-title bg-primary text-center">Simulateur de Credit</legend>
				<div class="mb-6">
					<label class="form-label">Montant :</label>
					<input type="text" class="form-control" name="montant"value="<%=model.getMontant()%>">
				</div>
				<div class="mb-6">
					<label class="form-label">Taux :</label>
					<input type="text" class="form-control" name="taux"value="<%=model.getTaux()%>">
				</div>
				<div class="mb-6">
					<label class="form-label">Durée :</label>
					<input type="text" class="form-control" name="duree"value="<%=model.getDuree()%>">
				</div>
				<p></p>
				<button type="submit" class="btn btn-primary">Calculer</button>
			</fieldset>
		</form>
		<div>
		<p></p>
		<label>Mensualité =<%out.println(model.getMensualite());%></label>
	</div>
		
	</div>
		</div>
		
	
	<%-- <p></p>
	<div class="container">
		<div class="card">
			<div class="card-title">Simulateur de Credit</div>
			<div class="card-body">
				<form action="controleur" method="post">
					<div class="form-group">
						<label class="control-label">Montant :</label>
						<input type="text" name="montant"value="<%=model.getMontant()%>">
					</div>
					<div class="form-group">
						<label class="control-label">Taux :</label>
						<input type="text" name="montant"value="<%=model.getTaux()%>">
					</div>
					<div class="form-group">
						<label class="control-label">Durée :</label>
						<input type="text" name="montant"value="<%=model.getDuree()%>">
					</div>
					<button class="btn btn-success">Calculer</button>
				</form> --%>
	<%-- 
	</div>
	</div>

	</div>

	<div>
		<label>Mensualité =<%
		out.println(model.getMensualite());
		%></label>
	</div>
 --%>
</body>
</html>