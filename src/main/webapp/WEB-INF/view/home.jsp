<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ page session="true" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"/>
<link rel="stylesheet" href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" href="resources/css/style.css">

	<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<title>Candidate Reisteration</title>
			<script type="text/javascript">
				$(document).ready(function(){
					$('#male').on('click',function(){
						$("input#gender").val($('#male').val());
						
						alert($("input#gender").val());
					});
					$('#female').on('click',function(){
						$("input#gender").val($('#female').val());
						
						alert($("input#gender").val());
					});
					$('#other').on('click',function(){
						$("input#gender").val($('#other').val());
						
						alert($("input#gender").val());
					});
				});
			</script>
</head>
<body>
	<div class="container form-container">
	<div class="">		
		<form action="">
			<div class="form-part" id="form-1">
			<div class="form-group form-element">
				<label for="fullname">Full Name</label>
				<input type="text" class="form-control" id="fullname" placeholder="Enter your full name">
			</div>
			<div class="form-group form-element">
				<label for="fathername">Father Name</label>
				<input type="text" class="form-control" id="fathername" placeholder="Enter your father's name">
			</div>
			<div class="form-group form-element">
				<label for="mothername">Mother Name</label>
				<input type="text" class="form-control" id="mothername" placeholder="Enter your mother's name">
			</div>
			<div class="form-group form-element">
				<label for="hscroll">Hsc. Roll No.</label>
				<input type="text" class="form-control" id="hscroll" placeholder="Enter your high school roll no">
			</div>
			<div class="form-group form-element">
				<label for="birthdate">Date of Birrth</label>
				<input type="date" class="form-control" id="birthdate">
			</div>
			<div class="form-group form-element">
				<label for="gender" class="form-check-label">Gender</label>
				<input type="hidden" id="gender" value="0">
				<div class="btn-group btng-gender" role="gender">
					<button type="button" id="male" class="btn-gender btn btn-outline-primary" value="M">Male</button>
					<button type="button" id="female" class="btn-gender btn btn-outline-primary" value="F">Female</button>
					<button type="button" id="other"class="btn-gender btn btn-outline-primary" value="O">Other</button>
				</div>
				</div>			
			<div class="form-group form-element next">
				<button id="next1" type="button" class="btn btn-primary">Next</button>
			</div>
			</div>
			<div id="form-2"  class="form-part">
			<div class="form-group form-element">
				<label for="permanentaddress">Permanent Address</label>
				<textarea rows="4" cols="10" class="form-control" id="permanentaddress" placeholder="Permanenet address"></textarea>
			</div>
			<div class="form-group form-element">
				<label for="state">State</label>
				<select id="state" class="form-control">
					<option selected="selected">Select state</option>
					<option>demo</option>
					<option>demo</option>
				</select>
			</div>
			<div class="form-group form-element">
				<label for="city">City</label>
				<select id="city" class="form-control">
					<option selected="selected">Select city</option>
					<option>demo</option>
					<option>demo</option>
				</select>
			</div>

			<div class="form-group form-element">
				<label for="stdcode">Std code</label>
				<input type="number" class="form-control" id="stdcode" placeholder="">
			</div>
			<div class="form-group form-element">
				<label for="phoneno">Phone No.</label>
				<input type="number" class="form-control" id="phoneno" placeholder="Phone no">
			</div>
			<div class="form-group form-element">
				<label for="mobile">Mobile No.</label>
				<input type="number" class="form-control" id="mobile" placeholder="Mobile no">
			</div>
			<div class="form-group form-element">
				<label for="email">Email</label>
				<input type="Email" class="form-control" id="email" placeholder="Email no">
			</div>
			
			<div class="form-group form-element">
				<button id="next2" type="button" class="btn btn-primary">Next</button>
			</div>
			</div>
			
		</form>
		</div>
	</div>
		<script type="text/javascript">
            $(document).ready(function(){
            	$('#next1').on('click',function(){
            		$('#form-1').hide("fast");
            		$('#form-2').show('slow');
            	});
            });
		</script>

</body>
</html>