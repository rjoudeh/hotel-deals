package com.hotel.model;

/**
 * 
 * @author rania
 *
 */
public class HotelPricingInfo {

	private float averagePriceValue;
	private float totalPriceValue;
	private float originalPricePerNight;
	private float hotelTotalBaseRate;
	private float hotelTotalTaxesAndFees;
	private String currency;
	private int hotelTotalMandatoryTaxesAndFees;
	private int percentSavings;
	private boolean drr;

	/**
	 * @return the averagePriceValue
	 */
	public float getAveragePriceValue() {
		return averagePriceValue;
	}

	/**
	 * @param averagePriceValue
	 *            the averagePriceValue to set
	 */
	public void setAveragePriceValue(float averagePriceValue) {
		this.averagePriceValue = averagePriceValue;
	}

	/**
	 * @return the totalPriceValue
	 */
	public float getTotalPriceValue() {
		return totalPriceValue;
	}

	/**
	 * @param totalPriceValue
	 *            the totalPriceValue to set
	 */
	public void setTotalPriceValue(float totalPriceValue) {
		this.totalPriceValue = totalPriceValue;
	}

	/**
	 * @return the originalPricePerNight
	 */
	public float getOriginalPricePerNight() {
		return originalPricePerNight;
	}

	/**
	 * @param originalPricePerNight
	 *            the originalPricePerNight to set
	 */
	public void setOriginalPricePerNight(float originalPricePerNight) {
		this.originalPricePerNight = originalPricePerNight;
	}

	/**
	 * @return the hotelTotalBaseRate
	 */
	public float getHotelTotalBaseRate() {
		return hotelTotalBaseRate;
	}

	/**
	 * @param hotelTotalBaseRate
	 *            the hotelTotalBaseRate to set
	 */
	public void setHotelTotalBaseRate(float hotelTotalBaseRate) {
		this.hotelTotalBaseRate = hotelTotalBaseRate;
	}

	/**
	 * @return the hotelTotalTaxesAndFees
	 */
	public float getHotelTotalTaxesAndFees() {
		return hotelTotalTaxesAndFees;
	}

	/**
	 * @param hotelTotalTaxesAndFees
	 *            the hotelTotalTaxesAndFees to set
	 */
	public void setHotelTotalTaxesAndFees(float hotelTotalTaxesAndFees) {
		this.hotelTotalTaxesAndFees = hotelTotalTaxesAndFees;
	}

	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * @param currency
	 *            the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	/**
	 * @return the hotelTotalMandatoryTaxesAndFees
	 */
	public int getHotelTotalMandatoryTaxesAndFees() {
		return hotelTotalMandatoryTaxesAndFees;
	}

	/**
	 * @param hotelTotalMandatoryTaxesAndFees
	 *            the hotelTotalMandatoryTaxesAndFees to set
	 */
	public void setHotelTotalMandatoryTaxesAndFees(int hotelTotalMandatoryTaxesAndFees) {
		this.hotelTotalMandatoryTaxesAndFees = hotelTotalMandatoryTaxesAndFees;
	}

	/**
	 * @return the percentSavings
	 */
	public int getPercentSavings() {
		return percentSavings;
	}

	/**
	 * @param percentSavings
	 *            the percentSavings to set
	 */
	public void setPercentSavings(int percentSavings) {
		this.percentSavings = percentSavings;
	}

	/**
	 * @return the drr
	 */
	public boolean isDrr() {
		return drr;
	}

	/**
	 * @param drr
	 *            the drr to set
	 */
	public void setDrr(boolean drr) {
		this.drr = drr;
	}
}
