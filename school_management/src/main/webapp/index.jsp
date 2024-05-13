<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
    <title>School Management</title>
</head>
<body>
    <div class="container-fluid p-5 bg-primary text-white text-center">
        <h1>School Management</h1>
    </div>
    <nav class="navbar navbar-expand-sm bg-dark navbar-dark">
        <div class="container-fluid">
          <div class="row collapse navbar-collapse" id="collapsibleNavbar">
            <ul class="navbar-nav text-center">
              <li class="nav-item col-sm-4">
                <a class="nav-link" href="hello">Student</a>
              </li>
              <li class="nav-item  col-sm-4">
                <a class="nav-link" href="contact">Teacher</a>
              </li>
              <li class="nav-item dropdown  col-sm-4">
                <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown">Admin Account</a>
                <ul class="dropdown-menu">
                  <li><a class="dropdown-item" href="#">Create Account</a></li>
                  <li><a class="dropdown-item" href="#">Logout</a></li>
                </ul>
              </li>
            </ul>
          </div>
        </div>
      </nav>
</body>
</html>