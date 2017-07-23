package com.hotel.model;

/**
 * 
 * @author rania
 *
 */
public class Destination {

	private long regionID;
	private String longName;
	private String country;
	private String province;
	private String city;

	/**
	 * @return the regionID
	 */
	public long getRegionID() {
		return regionID;
	}

	/**
	 * @param regionID
	 *            the regionID to set
	 */
	public void setRegionID(long regionID) {
		this.regionID = regionID;
	}

	/**
	 * @return the longName
	 */
	public String getLongName() {
		return longName;
	}

	/**
	 * @param longName
	 *            the longName to set
	 */
	public void setLongName(String longName) {
		this.longName = longName;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country
	 *            the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the province
	 */
	public String getProvince() {
		return province;
	}

	/**
	 * @param province
	 *            the province to set
	 */
	public void setProvince(String province) {
		this.province = province;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
}
