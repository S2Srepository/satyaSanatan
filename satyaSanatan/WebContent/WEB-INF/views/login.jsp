<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><html>
    <head>
<meta charset="ISO-8859-1">
<title>Login Page</title>

<link href="css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="login.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

</head>
<body id="LoginForm">
<div class="container">
<h1 class="form-heading"><b>Login Form</b></h1>
<div class="login-form">
<div class="main-div">
    <div class="panel">
   <h2>Admin Login</h2>
   <p>Please enter your email and password</p>
   </div>
    <form id="Login">

        <div class="form-group">
            <input type="email" class="form-control" id="inputEmail" placeholder="Email Address">
        </div>

        <div class="form-group">
            <input type="password" class="form-control" id="inputPassword" placeholder="Password">
        </div>

        <div class="forgot">
          <a href="#">Forgot password?</a>
        </div>
        
        <button type="submit" class="btn btn-primary">Login</button>

    </form>
    </div>

<p class="botto-text"></p>

</div>
</div>

 <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
     <script src="js/bootstrap.js"></script>

</body>
</html>