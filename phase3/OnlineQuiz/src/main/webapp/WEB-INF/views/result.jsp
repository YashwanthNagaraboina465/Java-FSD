<!DOCTYPE html>
<html>
<head>

<title>Result Page</title>
</head>
<body>

	<h3 class="bg-danger text-center mb-5 p-2">Check Your Score Here</h3>

	<div class="d-flex justify-content-center mt-4">
		<button type="button" th:onclick="window.location.href='/score'"
			class="btn btn-outline-warning mx-auto">View Score Board</button>
		<button type="button" th:onclick="window.location.href='/home'"
			class="btn btn-outline-warning mx-auto">Back to Homepage</button>
	</div>
</body>
</html>