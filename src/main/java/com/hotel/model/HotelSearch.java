package com.hotel.model;

import org.joda.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * To bind the controller model attribute
 * 
 * @author rania
 *
 */
public class HotelSearch {

	private String desName;
	private Integer lenOfStay;
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private LocalDate minTripStart;
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private LocalDate maxTripStart;
	private Integer rateFrom;
	private Integer rateTo;

	/**
	 * @return the desName
	 */
	public String getDesName() {
		return desName;
	}

	/**
	 * @param desName
	 *            the desName to set
	 */
	public void setDesName(String desName) {
		this.desName = desName;
	}

	/**
	 * @return the lenOfStay
	 */
	public Integer getLenOfStay() {
		return lenOfStay;
	}

	/**
	 * @param lenOfStay
	 *            the lenOfStay to set
	 */
	public void setLenOfStay(Integer lenOfStay) {
		this.lenOfStay = lenOfStay;
	}

	/**
	 * @return the maxTripStart
	 */
	public LocalDate getMaxTripStart() {
		return maxTripStart;
	}

	/**
	 * @param maxTripStart
	 *            the maxTripStart to set
	 */
	public void setMaxTripStart(LocalDate maxTripStart) {
		this.maxTripStart = maxTripStart;
	}

	/**
	 * @return the rateFrom
	 */
	public Integer getRateFrom() {
		return rateFrom;
	}

	/**
	 * @param rateFrom
	 *            the rateFrom to set
	 */
	public void setRateFrom(Integer rateFrom) {
		this.rateFrom = rateFrom;
	}

	/**
	 * @return the rateTo
	 */
	public Integer getRateTo() {
		return rateTo;
	}

	/**
	 * @param rateTo
	 *            the rateTo to set
	 */
	public void setRateTo(Integer rateTo) {
		this.rateTo = rateTo;
	}

	/**
	 * @return the minTripStart
	 */
	public LocalDate getMinTripStart() {
		return minTripStart;
	}

	/**
	 * @param minTripStart
	 *            the minTripStart to set
	 */
	public void setMinTripStart(LocalDate minTripStart) {
		this.minTripStart = minTripStart;
	}

}
