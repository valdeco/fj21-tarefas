<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib tagdir="/WEB-INF/tags" prefix="caelum" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
	<link href="resources/css/jquery-ui.css" rel="stylesheet"/>
	<link rel="stylesheet" href="resources/css/tarefas.css" />
	<script type="text/javascript" src="resources/js/jquery.js"></script>
	<script type="text/javascript" src="resources/js/jquery-ui.js"></script>
</head>
<body>
	
	<h3>Alterar tarefa - ${tarefa.id}</h3>
	
	<form action="alteraTarefa" method="post">
		<input type="hidden" name="id" value="${tarefa.id}" />
		Descrição:
		<br />
		<textarea name="descricao" cols="100" rows="5">${tarefa.descricao}
		</textarea>
		<br />		
		Finalizado?
		<input type="checkbox" name="finalizado" value="true" ${tarefa.finalizado? 'checked' : '' } />
		<br />
		
		Data de finalizaçao:
		<fmt:formatDate value="${tarefa.dataFinalizacao.time}" pattern="dd/MM/yyyy"/>		
		<caelum:campoData id="dataFinalizacao"/><br />	 
				
		<input type="submit" value="Alterar" />
	</form>
</body>
</html>