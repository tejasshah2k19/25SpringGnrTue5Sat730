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
						<h4>Student Registration Form</h4>
					</div>

					<div class="card-body">
						<form action="saveStudent" method="post" novalidate="novalidate">

							<!-- First Name -->
							<div class="mb-3">
								<label for="firstName" class="form-label">First Name</label> <input
									type="text" class="form-control" name="firstName"
									id="firstName" placeholder="Enter first name" required>
								<span class="text-danger">
									${result.getFieldError("firstName").getDefaultMessage()} 
								</span>

							</div>

							<!-- Last Name -->
							<div class="mb-3">
								<label for="lastName" class="form-label">Last Name</label> <input
									type="text" class="form-control" name="lastName" id="lastName"
									placeholder="Enter last name" required>
										<span class="text-danger">
									${result.getFieldError("lastName").getDefaultMessage()} 
								</span>
							</div>

							<!-- Email -->
							<div class="mb-3">
								<label for="email" class="form-label">Email</label> <input
									type="email" class="form-control" id="email" name="email"
									placeholder="Enter email" required>
										<span class="text-danger">
									${result.getFieldError("email").getDefaultMessage()} 
								</span>
							</div>

							<!-- Password -->
							<div class="mb-3">
								<label for="password" class="form-label">Password</label> <input
									type="password" class="form-control" id="password"
									name="password" placeholder="Enter password" required>
										<span class="text-danger">
									${result.getFieldError("password").getDefaultMessage()} 
								</span>
							</div>

							<!-- Age -->
							<div class="mb-3">
								<label for="age" class="form-label">Age</label> <input
									type="number" class="form-control" id="age" name="age"
									placeholder="Enter age" required>
									<span class="text-danger">
									${result.getFieldError("age").getDefaultMessage()} 
								</span>
							</div>

							<!-- Enrollment Year -->
							<div class="mb-3">
								<label for="enrollmentYear" class="form-label">Enrollment
									Year</label> <input type="number" class="form-control"
									id="enrollmentYear" name="enrollmentYear"
									placeholder="e.g. 2024" required>
									
									<span class="text-danger">
									${result.getFieldError("enrollmentYear").getDefaultMessage()} 
								</span>
							</div>

							<button type="submit" class="btn btn-primary w-100">Submit</button>

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
