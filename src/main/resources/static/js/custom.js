$(function() {
	$(".rateYo").each(function() {
		var rate = $(this).attr('rate');

		$(this).rateYo({
			halfStar : true,
			rating : rate,
			readOnly : true
		});
	});

	$("#fromRate").rateYo().on("rateyo.set", function(e, data) {
		$("#fromRateInput").val(data.rating);
	});

	$("#toRate").rateYo().on("rateyo.set", function(e, data) {
		$("#toRateInput").val(data.rating);
	});

	$("#fromRate").rateYo("option", "fullStar", true);

	if ($("#fromRateInput").val() != '')
		$("#fromRate").rateYo("option", "rating", $("#fromRateInput").val());

	$("#toRate").rateYo("option", "fullStar", true);

	if ($("#toRateInput").val() != '')
		$("#toRate").rateYo("option", "rating", $("#toRateInput").val());

	$(".clear").bind(
			"click",
			function() {
				$(this).closest('form').find(
						"input[type=text], input[type=date], input[type=number]").val("");

				$("#fromRate").rateYo("option", "rating",
						0);
				$("#toRate")
				.rateYo("option", "rating", 0);
				
				
				$("#fromRateInput").val('');
				$("#toRateInput").val('');

			});
});