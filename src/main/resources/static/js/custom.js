$(function() {

	(function(i, s, o, g, r, a, m) {
		i['GoogleAnalyticsObject'] = r;
		i[r] = i[r] || function() {
			(i[r].q = i[r].q || []).push(arguments)
		}, i[r].l = 1 * new Date();
		a = s.createElement(o), m = s.getElementsByTagName(o)[0];
		a.async = 1;
		a.src = g;
		m.parentNode.insertBefore(a, m)
	})(window, document, 'script',
			'https://www.google-analytics.com/analytics.js', 'ga');

	ga('create', 'UA-104236411-1', 'auto');
	ga('send', 'pageview');

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

	$(".clear")
			.bind(
					"click",
					function() {
						$(this)
								.closest('form')
								.find(
										"input[type=text], input[type=date], input[type=number]")
								.val("");

						$("#fromRate").rateYo("option", "rating", 0);
						$("#toRate").rateYo("option", "rating", 0);

						$("#fromRateInput").val('');
						$("#toRateInput").val('');

					});
});