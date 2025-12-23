<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Student Form</title>

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>

<body class="bg-light">

	<div class="container mt-5">
		<div class="row justify-content-center">
			<div class="col-md-6">

				<div class="card shadow">
					<div class="card-header text-center bg-primary text-white">
						<h4>Student Information</h4>
					</div>

					<div class="card-body">
						<form action="saveStudent" method="post" novalidate="novalidate">

							<!-- First Name -->
							<div class="mb-3">
									FirstName : ${student.firstName}

							</div>

							<!-- Last Name -->
							<div class="mb-3">
							LastName:  ${student.lastName}
							</div>

							<!-- Email -->
							<div class="mb-3">
								Email: ${student.email}
							</div>

							 

							<!-- Age -->
							<div class="mb-3">
							Age: ${student.age}
							</div>

							<!-- Enrollment Year -->
							<div class="mb-3">
								Enrollment Year:  ${student.enrollmentYear}
							</div>

 
						</form>
					</div>
				</div>

			</div>
		</div>
	</div>

	<!-- Bootstrap JS -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
