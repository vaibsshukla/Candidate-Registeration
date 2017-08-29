$(document).ready(function() {
		$('.btn-gender').on('click', function() {
			$("input#Gender").val($(this).val());

			$('.btng-gender').children('button').each(function() {
				if ($(this).hasClass('btn-pressed')) {
					$(this).removeClass('btn-pressed');
					$(this).addClass('btn-outline-primary');
				}
			});
			$(this).removeClass('btn-outline-primary');
			$(this).addClass('btn-pressed');
		});

		$('.btn-minority').on('click', function() {
			$('input[id="candidateDetail.IsCandidateFromMinority"]').val($(this).val());

			$('.btng-minority').children('button').each(function() {
				if ($(this).hasClass('btn-pressed')) {
					$(this).removeClass('btn-pressed');
					$(this).addClass('btn-outline-primary');
				}
			});
			$(this).removeClass('btn-outline-primary');
			$(this).addClass('btn-pressed');
		});

		$('.btn-disab').on('click', function() {
			$('input[id="candidateDetail.IsCandidateHandicapped"]').val($(this).val());

			$('.btng-disab').children('button').each(function() {
				if ($(this).hasClass('btn-pressed')) {
					$(this).removeClass('btn-pressed');
					$(this).addClass('btn-outline-primary');
				}
			});
			$(this).removeClass('btn-outline-primary');
			$(this).addClass('btn-pressed');

			if ($(this).attr('id') == 'dyes') {
				$('#form-4').show();
			} else {
				$('#form-4').hide();
			}
		});
		
		$('#back1').on('click', function() {
			$('#form-2').hide("fast").prop('required',false);
			$('#form-1').show('slow');
		});
		$('#back2').on('click', function() {
			$('#form-3').hide("fast").prop('required',false);
			$('#form-2').show('slow');
		});
/*		$('#next1').on('click', function() {
			$('#form-1').hide("fast");
			$('#form-2').show('slow');
		});
		$('#next2').on('click', function() {
			$('#form-2').hide("fast");
			$('#form-3').show('slow');
		});*/
	});

function form2()
{
		$('#form-1').hide("fast").prop('required',false);
		$('#form-2').show('slow');
	
}
function form3()
{
		$('#form-2').hide("fast").prop('required',false);
		$('#form-3').show('slow');
	
}

		$(document).ready(function(){
			   
			    $('#next1').click(function(){

                       $("#form-1").each(function(i){
                           $("span").each(function(j){
                               $(this).remove();
                           $("input").removeClass("invalid-control");
                           });
                       });
                
                var data = {};
		        data['fullName'] = $('#FullName').val();
		        data['fatherName'] = $('#FatherName').val();
		        data['motherName'] = $('#MotherName').val();
		        data['hscRollNo'] = $('#HscRollNo').val();
		        data['birthDate'] = $('#BirthDate').val();
		        data['gender'] = $('#Gender').val();
		        var form = JSON.stringify(data);
		        var error;
		        $.ajax({
		           type  :   "post" ,
		            contentType: "application/json",
		            url  :   "step1",
		           data :   JSON.stringify(data),
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
                       $("#form-1").each(function(i){
                           $("span").each(function(j){
                               $(this).remove();
                           });
                           $("input").removeClass("invalid-control");
                       });
	 			    	form2();			        	   
		           },
		           error : function(e){
	           		   console.log("error block");
	           		   $.each(e.responseJSON, function(key,value){
//                           $("form").find("span#"+key).text(value);
                           $("form").find("input#"+key).after('<span id='+ '"' +key+ '"'+' class="invalid">'+value+'</span>');
                           $("form").find("input#"+key).addClass("invalid-control");
                       });
		           },
		           complete : function(e, xhr, settings){
                       console.log(e);
		           }
		        	   
		        }); 
		    });
			    
		}); 

			$(document).ready(function(){
				   
 			    $('#next2').click(function(){

                           $("#form-2").each(function(i){
                               $("span").each(function(j){
                                   $(this).remove();
                               $("input").removeClass("invalid-div");
                               });
                           });
                    
                    var data = {};
			        data['candidatePermanentAddress'] = $('#permanentaddress').val();
			        data['state'] = $('#state').val();
			        data['city'] = $('#city').val();
			        data['candidateStdCode'] = $('#stdcode').val();
			        data['candidatePhone'] = $('#phoneno').val();
			        data['candidateMobileNo'] = $('#mobile').val();
			        data['candidateEmailId'] = $('#email').val();
			        console.log($('#permanentaddress').val());
			        var form = JSON.stringify(data);
			        var error;
			        $.ajax({
			           type  :   "post" ,
			            contentType: "application/json",
			            url  :   "step2",
			           data :   JSON.stringify(data),
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
                           $("#form-2").each(function(i){
                               $("span").each(function(j){
                                   $(this).remove();
                               });
                               $("div.f2").removeClass("invalid-div");
                           });
		 			    	form3();			        	   
			           },
			           error : function(e){
		           		   console.log("error block");
		           		   $.each(e.responseJSON, function(key,value){
//                               $("form").find("span#"+key).text(value);
                               $("form").find("div#"+key).after('<span id='+ '"' +key+ '"'+' class="invalid">'+value+'</span>');
                               $("form").find("div#"+key).addClass("invalid-div");
                           });
			           },
			           complete : function(e, xhr, settings){
                           console.log(e);
			           }
			        	   
			        }); 
			    });
 			    
			}); 
