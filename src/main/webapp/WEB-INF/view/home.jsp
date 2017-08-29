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
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css" integrity="sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ" crossorigin="anonymous">
<link rel="stylesheet" href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" href="resources/css/style.css">
<link rel="stylesheet" href="resources/css/validation.css">

<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
<script src="https://code.jquery.com/jquery-3.1.1.slim.min.js" integrity="sha384-A7FZj7v+d/sdmMqp/nOQwliLvUsJfDHW+k9Omg/a/EheAdgtzNs3hpfag6Ed950n" crossorigin="anonymous"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js" integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js" integrity="sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn" crossorigin="anonymous"></script>
<script type="text/javascript" src="resources/js/form.js"></script>
<script type="text/javascript" src="resources/js/data.js"></script>
<title>Candidate Registration</title>
<style>
</style>
</head>
<body>
	<div id="check"></div>
	<div class="container form-container">
		<div class="">
			<form:form modelAttribute="form1" method="post" onsubmit="return isValid()" action="register" id="forms">
				
				<div class="form-part" id="form-1" >
					<div class="form-group form-element">
						<label for="FullName">Full Name</label> 
						<form:input type="text"
							cssClass="form-control" id="FullName" path="fullName"
							placeholder="Enter your full name"/>
							<form:errors path="FullName" cssClass="invalid"></form:errors>
					</div>
					<div class="form-group form-element">
						<label for="FatherName">Father Name</label> <form:input type="text"
							class="form-control" id="FatherName" path="fatherName"
							placeholder="Enter your father's name"/>
							<form:errors path="FatherName" cssClass="invalid"></form:errors>
							
					</div>
					<div class="form-group form-element">
						<label for="MotherName">Mother Name</label> <form:input type="text"
							class="form-control" id="MotherName"
							placeholder="Enter your mother's name" path="motherName"/>
							<form:errors path="MotherName" cssClass="invalid"></form:errors>
					</div>
					<div class="form-group form-element">
						<label for="HscRollNo">Hsc. Roll No.</label> <form:input type="text"
							class="form-control" id="HscRollNo"
							placeholder="Enter your high school roll no" path="hscRollNo"/>
							<form:errors path="HscRollNo" cssClass="invalid"></form:errors>
					</div>
					<div class="form-group form-element">
						<label for="BirthDate">Date of Birth</label> <form:input type="date"
							class="form-control" id="BirthDate" path="birthDate"/>
							<form:errors path="BirthDate" cssClass="invalid"></form:errors>
					</div>
					<div class="form-group form-element">
						<label for="Gender" class="form-check-label">Gender</label> 
						<div class="btn-group btng-gender" role="gender">
							<button type="button" id="male"
								class="btn-gender btn btn-outline-primary" value="M">Male</button>
							<button type="button" id="female"
								class="btn-gender btn btn-outline-primary" value="F">Female</button>
							<button type="button" id="other"
								class="btn-gender btn btn-outline-primary" value="O">Other</button>
							<form:errors path="Gender" cssClass="invalid"></form:errors>
						<form:hidden path="gender" id="Gender" value=""/>
						</div>
					</div>
					<div class="form-group form-element next">
						<button id="next1" type="button" class="btn btn-primary">Next</button>
					</div>
				</div>
			
			<!-- This is form part 2 -->
				<div id="form-2" class="form-part">
					<div class="form-group form-element">
						<label for="permanentaddress">Permanent Address</label>
						<div id="CandidatePermanentAddress" class="f2">						
						<form:textarea rows="4" cols="10" class="form-control" path="candidateContactDetail.candidatePermanentAddress"
							id="permanentaddress" placeholder="Permanent address"></form:textarea>
							</div>
					</div>
					<div class="form-group form-element">
						<label for="state">State</label>
                        <div id="State" class="f2">
						<form:select id="state"
							class="form-control" path="candidateContactDetail.state">
							<option selected="selected" value="-1">Select state</option>
							<option value="1">demo</option>
							<option value="2">demo</option>
						</form:select>
                        </div>
					</div>
					<div class="form-group form-element">
						<label for="city">City</label> 
                        <div id="City" class="f2">
                        <form:select id="city"
							class="form-control" path="candidateContactDetail.city">
							<option selected="selected" value="-1">Select city</option>
							<option value="1">demo</option>
							<option value="2">demo</option>
                            </form:select></div>
					</div>

					<div class="form-group form-element">
						<label for="stdcode">Std code</label>
                        <form:input type="number"
							class="form-control" id="stdcode" placeholder="Code" path="candidateContactDetail.candidateStdCode"/>
					</div>
					<div class="form-group form-element">
						<label for="phoneno">Phone No.</label> <form:input type="number"
							class="form-control" id="phoneno" placeholder="Phone no" path="candidateContactDetail.candidatePhone"/>
					</div>
					<div class="form-group form-element">
						<label for="mobile">Mobile No.</label>
                        <div id="CandidateMobileNo" class="f2">
                        <form:input type="number"
                                    class="form-control" id="mobile" placeholder="Mobile no" path="candidateContactDetail.candidateMobileNo"/></div>
					</div>
					<div class="form-group form-element">
						<label for="email">Email</label> 
                        <div id="CandidateEmailId" class="f2">
                            <form:input type="Text" class="form-control" id="email" placeholder="Email no" path="candidateContactDetail.candidateEmailId"/>
                        </div>
					</div>

					<div class="form-group form-element">
						<button id="back1" type="button" class="btn btn-primary">Back</button>
						<button id="next2" type="button" class="btn btn-primary">Next</button>
					</div>
				</div>
				
				<!-- *********************** Form3 *********************************** -->
				<div id="form-3" class="form-part">
					<div class="form-group form-element">
						<label for="identificationmark">Identification Mark</label>
					
						<form:textarea rows="4" cols="10" class="form-control"
							id="identificationmark" placeholder="Optional" path="candidateDetail.candidateIdentificationMark"></form:textarea>
					</div>
					
					<div class="form-group form-element">
						<label for="category">Category</label> 
					
						<form:select id="candidateDetail.CandidateCategory" class="form-control" path="candidateDetail.candidateCategory">
							<option selected="selected" value="-1">Select category</option>
							<option value="1">demo</option>
							<option value="2">demo</option>
						</form:select>
					</div>

					<div class="form-group form-element">
						<label for="minority" class="form-check-label">Whether belongs to Minority ?</label> 
						<div class="btn-group btng-minority" role="minority">
							<button type="button" id="yes" class="btn-minority btn btn-outline-primary" value="1">Yes</button>
							<button type="button" id="no" class="btn-minority btn btn-outline-primary" value="2">No</button>
						</div>
							<form:hidden id="candidateDetail.IsCandidateFromMinority"	value="0" path="candidateDetail.isCandidateFromMinority"/>
					</div>
					<div class="form-group form-element">
						<label for="nationality">Nationality</label> 

						<form:select id="candidateDetail.CandidateNationality" class="form-control" path="candidateDetail.candidateNationality">
							<option selected="selected" value="-1">Select
								Nationality</option>
							<option value="1">Indian</option>
							<option value="2">Other</option>
						</form:select>
					</div>

					<div class="form-group form-element">
						<label for="disability" class="form-check-label">Are you
							Physically Disable ?</label> 

							<form:hidden id="candidateDetail.IsCandidateHandicapped" value="0" path="candidateDetail.isCandidateHandicapped"/>
							
						<div class="btn-group btng-disab" role="disability">
							<button type="button" id="dyes"
								class="btn-disab btn btn-outline-primary" value="1">Yes</button>
							<button type="button" id="dno"
								class="btn-disab btn btn-outline-primary" value="2">No</button>
						</div>
					</div>

					<div class="form-part" id="form-4">
						<div class="form-group form-element">
							<label for="disabilitytype">Disability Type</label>
							<form:select
								id="CandidateDisabilityType" path="candidateDisabilityDetail.candidateDisabilityType" class="form-control">
								<option selected="selected" value="-1">Select
									Disability</option>
							<option value="1">demo</option>
							<option value="2">demo</option>
							</form:select>
						</div>
						
						<div class="form-group form-element">
							<label for="disabilitypercentage">Disability Percentage</label> 
							<form:select id="CandidateDisabilityPercentage" class="form-control" path="candidateDisabilityDetail.candidateDisabilityPercentage">
								<option selected="selected" value="-1">Select
									Disability Percentage</option>
							<option value="1">demo</option>
							<option value="2">demo</option>
							</form:select>
						</div>
						<div class="form-group form-element">
							<label for="disabilitycertificate">Disability Certificate No.</label> 
								<form:input type="text" id="CandidateDisabilityCertificateNo"
								class="form-control" path="candidateDisabilityDetail.candidateDisabilityCertificateNo" placeholder="Disability Certificate No."/>
						</div>
						<div class="form-group form-element">
							<label for="certificatedate">Certificate Issue Date</label> 
							<form:input type="date" id="CertificateDate" class="form-control" path="candidateDisabilityDetail.certificateDate"/>
						</div>
					</div>
					<div class="form-group form-element">
						<button id="back2" type="button" class="btn btn-primary">Back</button>
						<button id="submit" type="submit" class="btn btn-primary">submit</button>
					</div>
				</div>
				
</form:form>
		</div>
	</div>			

    <script type="text/javascript">
	function isValid(){				 
                    $("#form-3").each(function(i){
                        $("span").each(function(j){
                            $(this).remove();
                            $(document.getElementsByClassName("invalid-control")).removeClass("invalid-control");
                        });
                    });
                    var val=false;
                    
                    var data = {};
                    var detail ={};
                    var d = {};
			        data['candidateIdentificationMark'] = $('#identificationmark').val();
			        data['candidateCategory'] = $(document.getElementById('candidateDetail.CandidateCategory')).val()
			        data['isCandidateFromMinority'] = $(document.getElementById('candidateDetail.IsCandidateFromMinority')).val();
			        data['candidateNationality'] = $(document.getElementById('candidateDetail.CandidateNationality')).val();
			        data['isCandidateHandicapped'] = $(document.getElementById('candidateDetail.IsCandidateHandicapped')).val();
			        detail['candidateDisabilityType'] = $('#CandidateDisabilityType').val();
			        detail['candidateDisabilityPercentage'] = $('#CandidateDisabilityPercentage').val();
			        detail['candidateDisabilityCertificateNo'] = $('#CandidateDisabilityCertificateNo').val();
			        detail['certificateDate'] = $('#CertificateDate').val();
//                    data['candidateDisabilityDetail'] = detail;
                    d['candidateDetail'] = data;
                    d['candidateDisabilityDetail'] = detail;
			        alert($('#candidateDetail.CandidateCategory').val());
			        var form = JSON.stringify(data);
			        var error;
			        $.ajax({
			           type  :   "post" ,
                        async : false,
			            contentType: "application/json",
			            url  :   "step3",
			           data :   JSON.stringify(d),
			           dataType :   "json",
			           statusCode : {
			           	   400: function(){
			           		   console.log("Sc block 400");
			           	   },
			           	   202: function(){
			           		   console.log("Sc block 200");
			           	   }
			           },
			           success : function(result){
		           		   console.log("Success block ");
                           $("#form-3").each(function(i){
                               $("span").each(function(j){
                                   $(this).remove();
                               });
                              $(document.getElementsByClassName("invalid-control")).removeClass("invalid-control");
                           });
                           alert("value of val at success");
                           val=true;
			           },
			           error : function(e){
		           		   console.log("error block");
		           		   $.each(e.responseJSON, function(key,value){
                               $("form").find($(document.getElementById(key))).after('<span id='+ '"' +key+ '"'+' class="invalid">'+value+'</span>');
                               $("form").find($(document.getElementById(key))).addClass("invalid-control");
                           });
		           		   val=false;
			           },
			           complete : function(e, xhr, settings){
                           console.log(e);
			           }
			        	   
			        })
			alert(val);
			return val;
    }
    
</script>
<script type="text/javascript">
	
</script>
</body>
</html>