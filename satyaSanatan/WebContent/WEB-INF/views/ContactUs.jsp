<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"><html lang="en">
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
   <style type="text/css">
   .cate-head{
	background: url('img/bhagwat-gite.png');
	background-repeat: no-repeat;
    height: 100%;
    padding-bottom: 20%;
    box-shadow: 5px 4px 29px 1px grey;
   /* width: 54%;*/
    height: 300px;
    margin: 30px;
}

.cate-head1{
	background: url('img/vedgranth.png');
	background-repeat: no-repeat;
    height: 100%;
    padding-bottom: 20%;
    box-shadow: 5px 4px 29px 1px grey;
   /* width: 54%;*/
    height: 300px;
    margin: 30px;

}
.row h2, p {
    color: #4e4a4a;
}
.row h4, p {
    color: #4e4a4a;
}
.cate-head2{
	background: url('img/ramayan.png');
	background-repeat: no-repeat;
    height: 100%;
    padding-bottom: 15%;
    box-shadow: 5px 4px 29px 1px grey;
   /* width: 54%;*/
    height: 300px;
    margin: 30px;
}

.cate-head3{
	background: url('img/mahabharat.png');
	background-repeat: no-repeat;
    height: 100%;
    padding-bottom: 15%;
    box-shadow: 5px 4px 29px 1px grey;
   /* width: 54%;*/
    height: 300px;
    margin: 30px;
}
   </style>
  </head>
  
  <body style="font-family: 'Quicksand', sans-serif;">
   
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
      <a class="navbar-brand" href="home.html"><img class="img-responsive" src="img/adi-shankara.png" width="30%"></a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      
     
      <ul class="nav navbar-nav navbar-right">
      	<li><a href="#">Category</a></li>
        <li><a href="about-us.html">About</a></li>
        <li><a href="#">Contact Us</a></li>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
</div>

	<div class="container">
		<div class="col-sm-12 col-md-12">
			<div class="ved-text">
				<p><b>Lorem Ipsum </b>is simply dummy text of the printing and <b>typesetting industry.</b> Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.</p>
			</div>
		</div>
		<div class="ved-category">
		<div class="row">
						<div class="col-sm-6" style="box-shadow: 0px 0px 4px 1px grey;height: 408px;" align="center">
						<h2><span><i class="fa fa-home" style="font-size:30px"></i> Organisation Name</span></h2><br>
						<h4><span><i class="fa fa-map-marker" style="font-size:30px"></i> Address xyz delhi sarkar - 110040 </span></h4>
						<h4><span><i class="fa fa-envelope" style="font-size:25px"></i> abcabc@gmail.com</span></h4>
						<h4><span><i class="fa fa-mobile" style="font-size:30px"></i> 9099909099,9099909099</span></h4>
						</div>

			<div class="col-sm-6" style="box-shadow: 0px 0px 4px 1px grey;">
			<form class="form-horizontal" action="getContactUsInfo">
			<div class="form-group" align="center" style="margin:20px ">
<%-- 	<c:if test="${msge!=NULL}">
	${msge}
	</c:if>		 --%>
    <h2>Contact Us</h2>
  </div>
  <div class="form-group">
    <label class="control-label col-sm-2" for="name">Name:</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" name="name" placeholder="Enter Name">
    </div>
  </div>
  <div class="form-group">
    <label class="control-label col-sm-2" for="email">Email:</label>
    <div class="col-sm-10"> 
      <input type="email" class="form-control" name="email" placeholder="Enter Email">
    </div>
  </div>
    <div class="form-group">
    <label class="control-label col-sm-2" for="mobile">Mobile No:</label>
    <div class="col-sm-10"> 
      <input type="number" class="form-control" name="mobile" placeholder="Enter Mobile No">
    </div>
  </div>
    <div class="form-group">
    <label class="control-label col-sm-2" for="query">Query:</label>
    <div class="col-sm-10"> 
      <textarea type="email" rows="4" class="form-control" name="query" placeholder="Enter Your Query"></textarea>
    </div>
  </div>
  <div class="form-group"> 
    <div class="col-sm-offset-2 col-sm-10" align="center">
      <button type="submit" class="btn btn-default">Submit</button>
    </div>
  </div>
</form>
			
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
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
     <script src="js/bootstrap.js"></script>
     <!-- <script>
     	window.onload=function(){if(window.jQuery){$(document).ready(function(){$(".sidebarNavigation .navbar-collapse").hide().clone().appendTo("body").removeAttr("class").addClass("sideMenu").show();$("body").append("<div class='overlay'></div>");$(".navbar-toggle, .navbar-toggler").on("click",function(){$(".sideMenu").addClass($(".sidebarNavigation").attr("data-sidebarClass"));$(".sideMenu, .overlay").toggleClass("open");$(".overlay").on("click",function(){$(this).removeClass("open");$(".sideMenu").removeClass("open")})});$("body").on("click",".sideMenu.open .nav-item",function(){if(!$(this).hasClass("dropdown")){$(".sideMenu, .overlay").toggleClass("open")}});$(window).resize(function(){if($(".navbar-toggler").is(":hidden")){$(".sideMenu, .overlay").hide()}else{$(".sideMenu, .overlay").show()}})})}else{console.log("sidebarNavigation Requires jQuery")}}
     </script> -->
  </body>
</html>