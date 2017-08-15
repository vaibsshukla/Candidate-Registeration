<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ page session="true"%>
<!Doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />
<link rel="stylesheet"
	href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" href="resources/css/style.css">

<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script type="text/javascript" src="resources/js/form.js"></script>
<script type="text/javascript">
/* 	$(document).ready(function(){
        $("#next1").click(function(){
    	   $.ajax({
              type  :   'post' ,
               url  :   'next',
               data :   {get_param :'next'},
               dataType :   'html',
               success :    function(result){
            	   
               }
           });
       }); 
	}); */
</script>
<title>Candidate Reisteration</title>
<style>
    .error {
        color: red; font-weight: bold;
    }
</style>
</head>
<body>
	<div class="container form-container">
		<div class="">
				<form:form action="next" method="post" modelAttribute="form">
				<div class="form-part" id="form-1">
					<div class="form-group form-element">
						<label for="fullname">Full Name</label> 
						<form:input type="text"
							cssClass="form-control" id="fullname" path="fullName"
							placeholder="Enter your full name"/>
							<form:errors path="fullName" cssClass=".error"></form:errors>
					</div>
					<div class="form-group form-element">
						<label for="fathername">Father Name</label> <form:input type="text"
							class="form-control" id="fathername" path="fatherName"
							placeholder="Enter your father's name"/>
							<form:errors path="fatherName" cssClass=".error"></form:errors>
							
					</div>
					<div class="form-group form-element">
						<label for="mothername">Mother Name</label> <form:input type="text"
							class="form-control" id="mothername"
							placeholder="Enter your mother's name" path="motherName"/>
							<form:errors path="motherName" cssClass=".error"></form:errors>
					</div>
					<div class="form-group form-element">
						<label for="hscroll">Hsc. Roll No.</label> <form:input type="text"
							class="form-control" id="hscroll"
							placeholder="Enter your high school roll no" path="hscRollNo"/>
							<form:errors path="hscRollNo" cssClass=".error"></form:errors>
					</div>
					<div class="form-group form-element">
						<label for="birthdate">Date of Birrth</label> <form:input type="date"
							class="form-control" id="birthdate" path="birthDate"/>
							<form:errors path="birthDate" cssClass=".error"></form:errors>
					</div>
					<div class="form-group form-element">
						<label for="gender" class="form-check-label">Gender</label> 
						<form:hidden path="gender" id="gender" value="0"/>
<!-- 						<input
							type="hidden" id="gender"  value="0"> -->
						<div class="btn-group btng-gender" role="gender">
							<button type="button" id="male"
								class="btn-gender btn btn-outline-primary" value="M">Male</button>
							<button type="button" id="female"
								class="btn-gender btn btn-outline-primary" value="F">Female</button>
							<button type="button" id="other"
								class="btn-gender btn btn-outline-primary" value="O">Other</button>
							<form:errors path="gender" cssClass=".error"></form:errors>
						</div>
					</div>
					<div class="form-group form-element next">
						<button id="nex1" type="submit" class="btn btn-primary">Next</button>
					</div>
				</div>
				<!-- THis is form part 2 -->
				<div id="form-2" class="form-part">
					<div class="form-group form-element">
						<label for="permanentaddress">Permanent Address</label>
						
						<form:textarea rows="4" cols="10" class="form-control" path="candidateContactDetail.candidatePermanentAddress"
							id="permanentaddress" placeholder="Permanent address"></form:textarea>
					</div>
					<div class="form-group form-element">
						<label for="state">State</label> <form:select id="state"
							class="form-control" path="candidateContactDetail.state">
							<option selected="selected">Select state</option>
							<option>demo</option>
							<option>demo</option>
						</form:select>
					</div>
					<div class="form-group form-element">
						<label for="city">City</label> <form:select id="city"
							class="form-control" path="candidateContactDetail.city">
							<option selected="selected">Select city</option>
							<option>demo</option>
							<option>demo</option>
						</</form:select>
					</div>

					<div class="form-group form-element">
						<label for="stdcode">Std code</label> <form:input type="number"
							class="form-control" id="stdcode" placeholder="Code" path="candidateContactDetail.candidateStdCode"/>
					</div>
					<div class="form-group form-element">
						<label for="phoneno">Phone No.</label> <form:input type="number"
							class="form-control" id="phoneno" placeholder="Phone no" path="candidateContactDetail.candidatePhone"/>
					</div>
					<div class="form-group form-element">
						<label for="mobile">Mobile No.</label> <form:input type="number"
							class="form-control" id="mobile" placeholder="Mobile no" path="candidateContactDetail.candidateMobileNo"/>
					</div>
					<div class="form-group form-element">
						<label for="email">Email</label> <form:input type="Email"
							class="form-control" id="email" placeholder="Email no" path="candidateContactDetail.candidateEmailId"/>
					</div>

					<div class="form-group form-element">
						<button id="back1" type="button" class="btn btn-primary">Back</button>
						<button id="next2" type="button" class="btn btn-primary">Next</button>
					</div>
				</div>

				<div id="form-3" class="form-part">
					<div class="form-group form-element">
						<label for="identificationmark">Identification Mark</label>
						<form:textarea rows="4" cols="10" class="form-control"
							id="identificationmark" placeholder="Optional" path="candidateDetail.candidateIdentificationMark"></form:textarea>
					</div>
					<div class="form-group form-element">
						<label for="category">Category</label> <form:select id="category"
							class="form-control" path="candidateDetail.candidateCategory">
							<option selected="selected" value="-1">Select category</option>
							<option>demo</option>
							<option>demo</option>
						</form:select>
					</div>

					<div class="form-group form-element">
						<label for="minority" class="form-check-label">Whether
							belongs to Minority ?</label> <form:hidden id="minority"
							value="0" path="candidateDetail.isCandidateFromMinority"/>
						<div class="btn-group btng-minority" role="minority">
							<button type="button" id="yes"
								class="btn-minority btn btn-outline-primary" value="Y">Yes</button>
							<button type="button" id="no"
								class="btn-minority btn btn-outline-primary" value="N">No</button>
						</div>
					</div>
					<div class="form-group form-element">
						<label for="nationality">Nationality</label> 
						<form:select id="nationality" class="form-control" path="candidateDetail.candidateNationality">
							<option selected="selected" value="-1">Select
								Nationality</option>
							<option value="Indian">Indian</option>
							<option value="other">Other</option>
						</form:select>
					</div>

					<div class="form-group form-element">
						<label for="disability" class="form-check-label">Are you
							Physically Disable ?</label> <form:hidden id="disability"
							value="0" path="candidateDetail.isCandidateHandicapped"/>
						<div class="btn-group btng-disab" role="disability">
							<button type="button" id="dyes"
								class="btn-disab btn btn-outline-primary" value="Y">Yes</button>
							<button type="button" id="dno"
								class="btn-disab btn btn-outline-primary" value="N">No</button>
						</div>
					</div>

					<div class="form-part" id="form-4">
						<div class="form-group form-element">
							<label for="disabilitytype">Disability Type</label>
							<form:select
								id="disabilitytype" path="candidateDisabilityDetail.candidateDisabilityType" class="form-control">
								<option selected="selected" value="-1">Select
									Disability</option>
								<option value="">Demo</option>
								<option value="">demo</option>
							</form:select>
						</div>
						<div class="form-group form-element">
							<label for="disabilitypercentage">Disability Percentage</label> <form:select
								id="disabilitypercentage" class="form-control" path="candidateDisabilityDetail.candidateDisabilityPercentage">
								<option selected="selected" value="-1">Select
									Disability Percentage</option>
								<option value="">Demo</option>
								<option value="">demo</option>
							</form:select>
						</div>
						<div class="form-group form-element">
							<label for="disabilitycertificate">Disability Certificate
								No.</label> <form:input type="text" id="disabilitycertificate"
								class="form-control" path="candidateDisabilityDetail.candidateDisabilityCertificateNo" placeholder="Disability Certificate No."/>
						</div>
						<div class="form-group form-element">
							<label for="certificatedate">Certificate Issue Date</label> <form:input
								type="date" id="certificatedate" class="form-control" path="candidateDisabilityDetail.certificateDate"/>
						</div>
					</div>
					<div class="form-group form-element">
						<button id="back2" type="button" class="btn btn-primary">Back</button>
						<input type="submit" class="btn btn-primary">
					</div>
				</div>
			</form:form>
		</div>
	</div>
	<script type="text/javascript">
		$(document).ready(function() {
		});
	</script>

</body>
</html>