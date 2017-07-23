<link rel="stylesheet" type="text/css"
	href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<link rel="stylesheet" type="text/css"
	href="../../css/jquery.rateyo.min.css" />
<link rel="stylesheet" type="text/css" href="../../css/custom.css" />
<script src="../../js/jquery.rateyo.min.js"></script>
<script src="../../js/custom.js"></script>

<div class="container">

	<div class="panel panel-default search-panel">
		<div class="panel-header">
			<h2>Seacrh hotels</h2>
		</div>

		<div class="panel-body">


			<form name="hotelSearch" class="form-horizontal"
				action="seacrh-hotels" method="post">
				<div class="form-group">
					<label class="control-label col-sm-2" for="des">Destination
						Name:</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="des" name="desName" value="${hotelSearch.desName!''}"
							placeholder="Enter destination name">
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-sm-2" for="lfs">Length Of
						Stay:</label>
					<div class="col-sm-10">
						<input type="number" class="form-control" id="lfs" value="${hotelSearch.lenOfStay!''}"
							name="lenOfStay" min=1 placeholder="Enter Length of stay">
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-sm-2" for="start">Min Start
						date:</label>
					<div class="col-sm-10">
						<input type="date" class="form-control" id="start"
							placeholder="Enter Min Start date" name="minTripStart" value="${hotelSearch.minTripStart!''}">
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-sm-2" for="end">Max Start
						date:</label>
					<div class="col-sm-10">
						<input type="date" class="form-control" id="end"
							placeholder="Enter Max Start date" name="maxTripStart" value="${hotelSearch.maxTripStart!''}">
					</div>
				</div>

				<div class="form-group">

					<div class="col-sm-6">
						<input type="hidden" class="form-control" id="fromRateInput" value="${hotelSearch.rateFrom!''}"
							name="rateFrom" /> <label class="control-label col-sm-4"
							for="rateFrom">Rate from:</label>
						<div class="col-sm-4">
							<p id="fromRate" rate="${hotelSearch.rateFrom!0}"></p>
						</div>
					</div>

					<div class="col-sm-6">
						<input type="hidden" class="form-control" id="toRateInput" value="${hotelSearch.rateTo!''}"
							name="rateTo" /> <label class="control-label col-sm-4"
							for="toRate">Rate To:</label>
						<div class="col-sm-4">
							<p id="toRate" rate="${hotelSearch.rateTo!0}"></p>
						</div>
					</div>
				</div>
				<div class="form-group ">
					<div class="col-sm-offset-2 col-sm-10">
						<button type="submit" class="btn btn-primary">Search</button>
						<button  type="button" class="btn btn-default clear">Clear</button>
					</div>
					
				</div>
			</form>
		</div>
	</div>


	<#if deals?has_content && deals.offers?has_content &&
	deals.offers.hotels?has_content > <#list deals.offers.hotels?chunk(4)
	as row>

	<div class="row">
		<#list row as hotel>
		<div class="col-sm-3">

			<div class="panel panel-default offers-panel">
				<div class="panel-body ">
					<div class="content">
						<div class="widget-head-color-box navy-bg p-lg text-center">
							<div class="m-b-md hotel-name">
								<h2 class="font-bold no-margins">
									${hotel.hotelInfo.hotelName}</h2>
							</div>
							
							<div class="img-div">
								<a href="${hotel.hotelUrls.hotelInfositeUrl}" target="blank"><img src="${hotel.hotelInfo.hotelImageUrl}"
									class="img-circle circle-border m-b-md" alt="profile"></a>
							</div>
								<p class="yellow">${hotel.hotelInfo.hotelDestination}</p>
						</div>
						<div class="widget-text-box">
							<h4>${hotel.destination.longName}</h4>
							<h4 class="red">length of stay:
								${hotel.offerDateRange.lengthOfStay}</h4>
							<p class="rateYo" rate="${hotel.hotelInfo.hotelStarRating}"></p>
							<p class="text-right price">
								${hotel.hotelPricingInfo.totalPriceValue}
								${hotel.hotelPricingInfo.currency}</p>
						</div>

					</div>
				</div>
			</div>
		</div>
		</#list>

	</div>


	</#list> <#else>
	<div class="row">
		<h2>No hotels found!</h2>
	</div>
	</#if>

</div>
