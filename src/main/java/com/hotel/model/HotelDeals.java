package com.hotel.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 
 * @author rania
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class HotelDeals {

	private OfferInfo offerInfo;
	private UserInfo userInfo;
	private Offers offers;

	public OfferInfo getOfferInfo() {
		return offerInfo;
	}

	public void setOfferInfo(OfferInfo offerInfo) {
		this.offerInfo = offerInfo;
	}

	/**
	 * @return the userInfo
	 */
	public UserInfo getUserInfo() {
		return userInfo;
	}

	/**
	 * @param userInfo
	 *            the userInfo to set
	 */
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	/**
	 * @return the offers
	 */
	public Offers getOffers() {
		return offers;
	}

	/**
	 * @param offers
	 *            the offers to set
	 */
	public void setOffers(Offers offers) {
		this.offers = offers;
	}

}
