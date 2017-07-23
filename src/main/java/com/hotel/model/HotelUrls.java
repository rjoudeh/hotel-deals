package com.hotel.model;

import java.io.UnsupportedEncodingException;

/**
 * 
 * @author rania
 *
 */
public class HotelUrls {
	private String hotelInfositeUrl;
	private String hotelSearchResultUrl;

	/**
	 * @return the hotelInfositeUrl
	 */
	public String getHotelInfositeUrl() {
		try {
			return java.net.URLDecoder.decode(hotelInfositeUrl, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			return hotelInfositeUrl;
		}
	}

	/**
	 * @param hotelInfositeUrl
	 *            the hotelInfositeUrl to set
	 */
	public void setHotelInfositeUrl(String hotelInfositeUrl) {
		this.hotelInfositeUrl = hotelInfositeUrl;
	}

	/**
	 * @return the hotelSearchResultUrl
	 */
	public String getHotelSearchResultUrl() {
		try {
			return java.net.URLDecoder.decode(hotelSearchResultUrl, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			return hotelInfositeUrl;
		}
	}

	/**
	 * @param hotelSearchResultUrl
	 *            the hotelSearchResultUrl to set
	 */
	public void setHotelSearchResultUrl(String hotelSearchResultUrl) {
		this.hotelSearchResultUrl = hotelSearchResultUrl;
	}
}
