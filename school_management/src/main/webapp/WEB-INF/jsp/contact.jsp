<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
<title>Student Record</title>
<!-- <style>
        input, textarea, select {
            border: none;
            padding: 1rem;
            border-radius: 1rem;
            background: #e8e8e8;
            box-shadow: 20px 20px 60px #c5c5c5,
                -20px -20px 60px #ffffff;
            transition: 0.3s;
        }

        input, textarea, select:focus {
            outline-color: #e8e8e8;
            background: #e8e8e8;
            box-shadow: inset 20px 20px 60px #c5c5c5,
                inset -20px -20px 60px #ffffff;
            transition: 0.3s;
        }
    </style> -->
</head>

<body>
	<div class="container mt-3">
		<h2 class="text-center">Record Student Form</h2>
		<form action="/action_page.php">
			<div class="row">
				<div class="mb-3 mt-3 col-sm-4">
					<label for="name">Student Name:</label> <input type="text"
						class="form-control" id="name" placeholder="Enter Student Name">
				</div>
				<div class="mb-3 mt-3 col-sm-4">
					<label for="gender">Gender:</label> <input type="text"
						class="form-control" id="gender" placeholder="Enter Gender">
				</div>
				<div class="mb-3 mt-3 col-sm-4">
					<label for="fathername">FatherName:</label> <input type="text"
						class="form-control" id="fathername"
						placeholder="Enter Father Name">
				</div>
			</div>
			<div class="row">
				<div class="mb-3 mt-3 col-sm-4">
					<label for="birthday">Date Of Birth</label> <input type="date"
						id="birthday" class="form-control">
				</div>
				<div class="mb-3 mt-3 col-sm-4">
					<label for="phoneno">Phone Number:</label> <input type="text"
						class="form-control" id="phoneno" placeholder="Enter Phone Number">
				</div>
				<div class="mb-3 mt-3 col-sm-4">
					<label for="email">Email:</label> <input type="email"
						class="form-control" id="email" placeholder="Enter Email">
				</div>
			</div>
			<div class="row">
				<div class="mb-3 mt-3 col-sm-4">
					<label for="Address" class="form-label">Address</label>
					<textarea class="form-control" id="Address" rows="3"></textarea>
				</div>
				<div class="mb-3 mt-3 col-sm-4">
					<label for=" grade" class="form-label">Grade</label> <select
						class="form-select" id="grade" name="grade">
						<option selected disabled>--Choose Grade--</option>
						<option>1</option>
						<option>2</option>
						<option>3</option>
						<option>4</option>
						<option>5</option>
						<option>6</option>
						<option>7</option>
						<option>8</option>
						<option>9</option>
						<option>10</option>
					</select>
				</div>
				<div class="mb-3 mt-3 col-sm-4">
					<label for=" classroom" class="form-label">Classroom</label> <select
						class="form-select" id="classroom" name="classroom">
						<option selected disabled>--Choose Classroom--</option>
						<option>Jasmine</option>
						<option>Orchid</option>
						<option>Sunflower</option>
						<option>Rose</option>
						<option>Lily</option>
					</select>
				</div>
			</div>
			<div class="mb-3 mt-3 text-center">
				<button type="submit" class="btn btn-primary">Save</button>
				<button type="button" class="btn btn-danger">Delete</button>
				<button type="reset" class="btn btn-secondary">Clear</button>
			</div>
		</form>
		<table class="table table-hover table-dark ">
			<thead>
				<tr>
					<th scope="col">#</th>
					<th scope="col">StudentName</th>
					<th scope="col">FatherName</th>
					<th scope="col">Date Of Birth</th>
					<th scope="col">Email</th>
					<th scope="col">PhoneNumber</th>
					<th scope="col">Gender</th>
					<th scope="col">Address</th>
					<th scope="col">Grade</th>
					<th scope="col">Classroom</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<th scope="row">1</th>
					<td>Sam</td>
					<td>U Tom</td>
					<td>12/1/2000</td>
					<td>sam@gmail.com</td>
					<td>09652525201</td>
					<td>Male</td>
					<td>Lathar</td>
					<td>6</td>
					<td>Lily</td>
				</tr>
				<tr>
					<th scope="row">2</th>
					<td>Mike</td>
					<td>U Mya</td>
					<td>4/2/1999</td>
					<td>mike@gmail.com</td>
					<td>09651522365</td>
					<td>Male</td>
					<td>Dala</td>
					<td>6</td>
					<td>Sunflower</td>
				</tr>
				<tr>
					<th scope="row">2</th>
					<td>John</td>
					<td>U Tun</td>
					<td>17/11/1998</td>
					<td>john@gmail.com</td>
					<td>09651522365</td>
					<td>Male</td>
					<td>North Dagon</td>
					<td>10</td>
					<td>Orchid</td>
				</tr>
			</tbody>
		</table>
	</div>
</body>

</html>