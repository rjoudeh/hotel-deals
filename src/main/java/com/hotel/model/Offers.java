package com.hotel.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * @author rania
 *
 */
public class Offers {
	
	@JsonProperty("Hotel")
	private List<Hotel> hotels;

	/**
	 * @return the hotels
	 */
	public List<Hotel> getHotels() {
		return hotels;
	}

	/**
	 * @param hotels
	 *            the hotels to set
	 */
	public void setHotels(List<Hotel> hotels) {
		this.hotels = hotels;
	}

}
