<!DOCTYPE html>
<html>
<head>
	<title>Score Board</title>
</head>
<body>

	<!-- Main Container Start -->
	<div class="main-container container py-5 px-4">
		<h3 class="bg-danger text-center mb-5 p-2">Top Scores Of All Time</h3>
		
		<table class="bg-dark text-light">
			<tr>
				<th>Name</th>
				<th>Score</th>
			</tr>
			<tr th:each="score : ${sList}">
				<td th:text="${score.username}"></td>
				<td th:text="${score.totalCorrect}"></td>
			</tr>
		</table>
		<br>
		<button type="button" th:onclick="window.location.href='/viewParticipantForm'"
			class="btn btn-outline-warning mx-auto">Attempt again</button>
			
		<button type="button" th:onclick="window.location.href='/home'"
			class="btn btn-outline-warning mx-auto">Back to Homepage</button>
		
</body>
</html>