<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Veda Project</title>

    <!-- Bootstrap -->
     <link href="css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="css/veda.css">
    <link rel="stylesheet" type="text/css" href="css/font-awesome.min.css"> 
    <link rel="stylesheet" type="text/css" href="css/font-awesome.css">

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
   <link href="https://fonts.googleapis.com/css?family=Quicksand" rel="stylesheet">
   
  </head>
  <body  style="font-family: 'Quicksand', sans-serif;">
   
<div id="header">
<nav class="navbar navbar-default">
  <div class="container">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="home.html"><img class="img-responsive" src="image/adi-shankara-logo.png" width="100%"></a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">   
     
       <ul class="nav navbar-nav navbar-right">
	      <li class="courselist_link"><a href="About_Us">About</a></li>
	      <li class="courselist_link"><a href="Contact_US">Contact Us</a></li>
	      <li class="courselist_link"><a href="Upload_document">Upload File</a></li>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
</div>

<div class="uploading-are" style="margin-top: 3%">
 <div class="container">
    <div class="row">
        <div class="col-md-12">
          <p style="color: #222; font-size: 19px;">A Team of individual software developers who want to develop a platform to boost interest of this generation towards spirituality. The purpose is to create repository of Indian Texts and serve as a one stop shop of</p>
            <div class="well well-sm">
                <form action="Upload_document">
                <div class="row">
                    <div class="col-md-6">
                        <div class="form-group">
                            <label for="name">Full Name</label>
                            <div class="input-group">
                                <span class="input-group-addon"><span class="fa fa-user fa-lg fa-fw" aria-hidden="true"></span>
                                </span>
                                <input type="name" class="form-control" name="name" placeholder="Enter Full Name" required="required" /></div>
                        </div>
                        <div class="form-group">
                            <label for="email">Email Address</label>
                            <div class="input-group">
                                <span class="input-group-addon"><span class="fa fa-envelope fa-lg fa-fw" aria-hidden="true"></span>
                                </span>
                                <input type="email" class="form-control" name="mail" placeholder="Enter Email Address" required="required" /></div>
                        </div>
                        <div class="form-group">
                            <label for="Mobilenumber">Mobile Number</label>
                            <div class="input-group">
                                <span class="input-group-addon"><span  class="fa fa-mobile fa-lg fa-fw" aria-hidden="true"></span>
                                </span>
                                <input type="mobile" class="form-control" maxlength="15" minlength="10" name="mobile" placeholder="Enter Mobile Number" required="required" /></div>
                        </div>
                       <!--  <div class="form-group">
                            <label for="name">Mobile Number</label>
                            <input type="text" class="form-control" id="mobile" placeholder="Enter Mobile Number" required="required" />
                        </div> -->
                        <div class="form-group">
                            <label class="newbtn blah" for="subject">Upload File</label>
                            <input name="fileName" class='pis' onchange="readURL(this);" type="file" accept=".png,.jpg,.jpeg,.pdf" >
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="form-group">
                            <label for="name">Description</label>
                            <textarea name="fileDiscription"  class="form-control" rows="9" cols="25" required="required"
                                placeholder="Write Description here.."></textarea>
                        </div>
                    </div>
                    <div class="col-md-12">
                        <button type="submit" class="btn btn-primary pull-right" id="btnContactUs">Send Message</button>
                    </div>
                </div>
                </form>
            </div>
        </div>
   
    </div>
</div>

</div>

<div class="veda-footer">
	<div class="footer">
		<p>© Copyright 2018. All Rights Reserved.</p>
	</div>
</div>



    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<!--     <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script> -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
     <script src="js/bootstrap.js"></script>

  <script>
 
       $('.newbtn').bind("click" , function () {
        $('#pic').click();
 });
 
  function readURL(input) {
            if (input.files && input.files[0]) {
                var reader = new FileReader();

                reader.onload = function (e) {
                    $('#blah')
                        .attr('src', e.target.result);
                };

                reader.readAsDataURL(input.files[0]);
            }
        }
</script>
  </body>
</html>