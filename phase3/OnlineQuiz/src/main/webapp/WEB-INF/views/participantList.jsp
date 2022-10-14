<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Participants</title>
</head>
<body>
	<h1>Participants</h1>
	<table>
		<tr>
			<th>Id</th>
			<th>Name</th>
		</tr>
		<tr th:each="participant : ${participants}">
		<td th:text="${participant.id}"></td>
		<td th:text="${paticipant.name}"></td>
		</tr>

	</table>

	<p>Click here to go to access page <a href="access">Control Access</a></p>
	
	
</body>
</html>