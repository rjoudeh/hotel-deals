package com.hotel.helper;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hotel.model.HotelDeals;
import com.hotel.model.HotelSearch;

/**
 * Helper class to get hotel deals from restful service
 * 
 * @author rania
 *
 */
@Component
public class HotelDealsHelper {

	/**
	 * parameters' names
	 */
	@Value("${offers.hostName}")
	public String offersHostName;
	@Value("${offers.serviceName}")
	public String offersServiceName;

	@Value("${offers.param.destinationName}")
	public String desNameParam;
	@Value("${offers.param.lengthOfStay}")
	public String lengthOfStay;
	@Value("${offers.param.minTripStart}")
	public String minTripStartDate;
	@Value("${offers.param.maxTripStart}")
	public String maxTripStartDate;
	@Value("${offers.param.minStarRating}")
	public String minStarRating;
	@Value("${offers.param.maxStarRating}")
	public String maxStarRating;

	/**
	 * 
	 * @param hotelSearch
	 * @return
	 * @throws Exception
	 */
	public HotelDeals findHotelDeals(HotelSearch hotelSearch) throws Exception {
		Map<String, String> paramList = new HashMap<>();

		populateParamList(paramList, hotelSearch);

		ApiClientGet apiClientGet = new ApiClientGet(offersHostName, offersServiceName, null, paramList);
		String response = apiClientGet.callApiService();

		ObjectMapper mapper = new ObjectMapper();
		return mapper.readValue(response, HotelDeals.class);
	}

	/**
	 * 
	 * @param paramList
	 * @param hotelSearch
	 */
	private void populateParamList(Map<String, String> paramList, HotelSearch hotelSearch) {
		if (!StringUtils.isEmpty(hotelSearch.getDesName())) {
			paramList.put(desNameParam, hotelSearch.getDesName());
		}

		if (!StringUtils.isEmpty(hotelSearch.getLenOfStay())) {
			paramList.put(lengthOfStay, hotelSearch.getLenOfStay() + "");
		}

		if (!StringUtils.isEmpty(hotelSearch.getRateFrom())) {
			paramList.put(minStarRating, hotelSearch.getRateFrom() + "");
		}

		if (!StringUtils.isEmpty(hotelSearch.getRateTo())) {
			paramList.put(maxStarRating, hotelSearch.getRateTo() + "");
		}

		if (!StringUtils.isEmpty(hotelSearch.getMinTripStart())) {
			paramList.put(minTripStartDate, hotelSearch.getMinTripStart() + "");
		}

		if (!StringUtils.isEmpty(hotelSearch.getMaxTripStart())) {
			paramList.put(maxTripStartDate, hotelSearch.getMaxTripStart() + "");
		}
	}
}
