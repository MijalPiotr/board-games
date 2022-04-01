<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>

<html>

<head>
	<title>Lista Gier</title>
</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2> MGB - Menadzer Gier Planszowych</h2>
			</div>
		</div>
		
		<div id="container">
		
			<div id="content">
			
			<!--  add out html table here -->
			
			<table cellspacing="10" cellpadding="1">
				<tr>
					<th>Nazwa Gry</th>
					<th>Autor</th>
					<th>Wydawnictwo</th>
				</tr>
				
				<!--  loop over and print our boardgames -->
				<c:forEach var="tempBoardGame" items="${boardGames}">
				
					<tr>
						<td> ${tempBoardGame.title} </td>
						<td> ${tempBoardGame.author} </td>
						<td> ${tempBoardGame.publisher} </td>
					</tr>
				
				</c:forEach>
				
			</table>
						
		</div>
			
	</div>

</body>

</html>