$(document).ready(function() {
		$('.btn-gender').on('click', function() {
			$("input#gender").val($(this).val());

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
			$("input#minority").val($(this).val());

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
			$("input#disability").val($(this).val());

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
			$('#form-2').hide("fast");
			$('#form-1').show('slow');
		});
		$('#back2').on('click', function() {
			$('#form-3').hide("fast");
			$('#form-2').show('slow');
		});
		$('#next1').on('click', function() {
/*			$('#form-1').hide("fast");
			$('#form-2').show('slow');*/
		});
		$('#next2').on('click', function() {
			$('#form-2').hide("fast");
			$('#form-3').show('slow');
		});
	});
