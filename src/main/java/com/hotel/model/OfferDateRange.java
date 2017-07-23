package com.hotel.model;

import org.joda.time.LocalDate;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.joda.deser.LocalDateDeserializer;

/**
 * 
 * @author rania
 *
 */
public class OfferDateRange {

	@JsonDeserialize(using=LocalDateDeserializer.class)
	private LocalDate travelStartDate;
	@JsonDeserialize(using=LocalDateDeserializer.class)
	private LocalDate travelEndDate;
	private int lengthOfStay;

	
	/**
	 * @return the lengthOfStay
	 */
	public int getLengthOfStay() {
		return lengthOfStay;
	}

	/**
	 * @param lengthOfStay
	 *            the lengthOfStay to set
	 */
	public void setLengthOfStay(int lengthOfStay) {
		this.lengthOfStay = lengthOfStay;
	}

	/**
	 * @return the travelStartDate
	 */
	public LocalDate getTravelStartDate() {
		return travelStartDate;
	}

	/**
	 * @param travelStartDate the travelStartDate to set
	 */
	public void setTravelStartDate(LocalDate travelStartDate) {
		this.travelStartDate = travelStartDate;
	}

	/**
	 * @return the travelEndDate
	 */
	public LocalDate getTravelEndDate() {
		return travelEndDate;
	}

	/**
	 * @param travelEndDate the travelEndDate to set
	 */
	public void setTravelEndDate(LocalDate travelEndDate) {
		this.travelEndDate = travelEndDate;
	}

}
