package com.hotel.model;

import org.joda.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.joda.deser.LocalDateDeserializer;

/**
 * 
 * @author rania
 *
 */
public class HotelInfo {

	private long hotelId;
	private String hotelName;
	private String hotelDestination;
	private long hotelDestinationRegionID;
	private String hotelLongDestination;
	private String hotelStreetAddress;
	private String hotelCity;
	private String hotelProvince;
	private String hotelCountryCode;
	private String hotelLocation;
	private float hotelLatitude;
	private float hotelLongitude;
	private float hotelStarRating;
	private int hotelGuestReviewRating;

	@JsonDeserialize(using = LocalDateDeserializer.class)
	@JsonFormat( pattern="MM/dd/yyyy")
	private LocalDate travelStartDate;
	@JsonDeserialize(using = LocalDateDeserializer.class)
	@JsonFormat( pattern="MM/dd/yyyy")
	private LocalDate travelEndDate;
	private String hotelImageUrl;
	private float carPackageScore;
	private String description;
	private int distanceFromUser;
	private String language;
	private float movingAverageScore;
	private int promotionAmount;
	private String promotionDescription;
	private String promotionTag;
	private float rawAppealScore;
	private int relevanceScore;
	private int statusCode;
	private String statusDescription;
	private boolean carPackage;
	private boolean allInclusive;

	/**
	 * @return the hotelId
	 */
	public long getHotelId() {
		return hotelId;
	}

	/**
	 * @param hotelId
	 *            the hotelId to set
	 */
	public void setHotelId(long hotelId) {
		this.hotelId = hotelId;
	}

	/**
	 * @return the hotelName
	 */
	public String getHotelName() {
		return hotelName;
	}

	/**
	 * @param hotelName
	 *            the hotelName to set
	 */
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	/**
	 * @return the hotelDestination
	 */
	public String getHotelDestination() {
		return hotelDestination;
	}

	/**
	 * @param hotelDestination
	 *            the hotelDestination to set
	 */
	public void setHotelDestination(String hotelDestination) {
		this.hotelDestination = hotelDestination;
	}

	/**
	 * @return the hotelDestinationRegionID
	 */
	public long getHotelDestinationRegionID() {
		return hotelDestinationRegionID;
	}

	/**
	 * @param hotelDestinationRegionID
	 *            the hotelDestinationRegionID to set
	 */
	public void setHotelDestinationRegionID(long hotelDestinationRegionID) {
		this.hotelDestinationRegionID = hotelDestinationRegionID;
	}

	/**
	 * @return the hotelLongDestination
	 */
	public String getHotelLongDestination() {
		return hotelLongDestination;
	}

	/**
	 * @param hotelLongDestination
	 *            the hotelLongDestination to set
	 */
	public void setHotelLongDestination(String hotelLongDestination) {
		this.hotelLongDestination = hotelLongDestination;
	}

	/**
	 * @return the hotelStreetAddress
	 */
	public String getHotelStreetAddress() {
		return hotelStreetAddress;
	}

	/**
	 * @param hotelStreetAddress
	 *            the hotelStreetAddress to set
	 */
	public void setHotelStreetAddress(String hotelStreetAddress) {
		this.hotelStreetAddress = hotelStreetAddress;
	}

	/**
	 * @return the hotelCity
	 */
	public String getHotelCity() {
		return hotelCity;
	}

	/**
	 * @param hotelCity
	 *            the hotelCity to set
	 */
	public void setHotelCity(String hotelCity) {
		this.hotelCity = hotelCity;
	}

	/**
	 * @return the hotelProvince
	 */
	public String getHotelProvince() {
		return hotelProvince;
	}

	/**
	 * @param hotelProvince
	 *            the hotelProvince to set
	 */
	public void setHotelProvince(String hotelProvince) {
		this.hotelProvince = hotelProvince;
	}

	/**
	 * @return the hotelCountryCode
	 */
	public String getHotelCountryCode() {
		return hotelCountryCode;
	}

	/**
	 * @param hotelCountryCode
	 *            the hotelCountryCode to set
	 */
	public void setHotelCountryCode(String hotelCountryCode) {
		this.hotelCountryCode = hotelCountryCode;
	}

	/**
	 * @return the hotelLocation
	 */
	public String getHotelLocation() {
		return hotelLocation;
	}

	/**
	 * @param hotelLocation
	 *            the hotelLocation to set
	 */
	public void setHotelLocation(String hotelLocation) {
		this.hotelLocation = hotelLocation;
	}

	/**
	 * @return the hotelLatitude
	 */
	public float getHotelLatitude() {
		return hotelLatitude;
	}

	/**
	 * @param hotelLatitude
	 *            the hotelLatitude to set
	 */
	public void setHotelLatitude(float hotelLatitude) {
		this.hotelLatitude = hotelLatitude;
	}

	/**
	 * @return the hotelLongitude
	 */
	public float getHotelLongitude() {
		return hotelLongitude;
	}

	/**
	 * @param hotelLongitude
	 *            the hotelLongitude to set
	 */
	public void setHotelLongitude(float hotelLongitude) {
		this.hotelLongitude = hotelLongitude;
	}

	/**
	 * @return the hotelStarRating
	 */
	public float getHotelStarRating() {
		return hotelStarRating;
	}

	/**
	 * @param hotelStarRating
	 *            the hotelStarRating to set
	 */
	public void setHotelStarRating(float hotelStarRating) {
		this.hotelStarRating = hotelStarRating;
	}

	/**
	 * @return the hotelGuestReviewRating
	 */
	public int getHotelGuestReviewRating() {
		return hotelGuestReviewRating;
	}

	/**
	 * @param hotelGuestReviewRating
	 *            the hotelGuestReviewRating to set
	 */
	public void setHotelGuestReviewRating(int hotelGuestReviewRating) {
		this.hotelGuestReviewRating = hotelGuestReviewRating;
	}

	/**
	 * @return the travelStartDate
	 */
	public LocalDate getTravelStartDate() {
		return travelStartDate;
	}

	/**
	 * @param travelStartDate
	 *            the travelStartDate to set
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
	 * @param travelEndDate
	 *            the travelEndDate to set
	 */
	public void setTravelEndDate(LocalDate travelEndDate) {
		this.travelEndDate = travelEndDate;
	}

	/**
	 * @return the hotelImageUrl
	 */
	public String getHotelImageUrl() {
		return hotelImageUrl;
	}

	/**
	 * @param hotelImageUrl
	 *            the hotelImageUrl to set
	 */
	public void setHotelImageUrl(String hotelImageUrl) {
		this.hotelImageUrl = hotelImageUrl;
	}

	/**
	 * @return the carPackageScore
	 */
	public float getCarPackageScore() {
		return carPackageScore;
	}

	/**
	 * @param carPackageScore
	 *            the carPackageScore to set
	 */
	public void setCarPackageScore(float carPackageScore) {
		this.carPackageScore = carPackageScore;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the distanceFromUser
	 */
	public int getDistanceFromUser() {
		return distanceFromUser;
	}

	/**
	 * @param distanceFromUser
	 *            the distanceFromUser to set
	 */
	public void setDistanceFromUser(int distanceFromUser) {
		this.distanceFromUser = distanceFromUser;
	}

	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * @param language
	 *            the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}

	/**
	 * @return the movingAverageScore
	 */
	public float getMovingAverageScore() {
		return movingAverageScore;
	}

	/**
	 * @param movingAverageScore
	 *            the movingAverageScore to set
	 */
	public void setMovingAverageScore(float movingAverageScore) {
		this.movingAverageScore = movingAverageScore;
	}

	/**
	 * @return the promotionAmount
	 */
	public int getPromotionAmount() {
		return promotionAmount;
	}

	/**
	 * @param promotionAmount
	 *            the promotionAmount to set
	 */
	public void setPromotionAmount(int promotionAmount) {
		this.promotionAmount = promotionAmount;
	}

	/**
	 * @return the promotionDescription
	 */
	public String getPromotionDescription() {
		return promotionDescription;
	}

	/**
	 * @param promotionDescription
	 *            the promotionDescription to set
	 */
	public void setPromotionDescription(String promotionDescription) {
		this.promotionDescription = promotionDescription;
	}

	/**
	 * @return the promotionTag
	 */
	public String getPromotionTag() {
		return promotionTag;
	}

	/**
	 * @param promotionTag
	 *            the promotionTag to set
	 */
	public void setPromotionTag(String promotionTag) {
		this.promotionTag = promotionTag;
	}

	/**
	 * @return the rawAppealScore
	 */
	public float getRawAppealScore() {
		return rawAppealScore;
	}

	/**
	 * @param rawAppealScore
	 *            the rawAppealScore to set
	 */
	public void setRawAppealScore(float rawAppealScore) {
		this.rawAppealScore = rawAppealScore;
	}

	/**
	 * @return the relevanceScore
	 */
	public int getRelevanceScore() {
		return relevanceScore;
	}

	/**
	 * @param relevanceScore
	 *            the relevanceScore to set
	 */
	public void setRelevanceScore(int relevanceScore) {
		this.relevanceScore = relevanceScore;
	}

	/**
	 * @return the statusCode
	 */
	public int getStatusCode() {
		return statusCode;
	}

	/**
	 * @param statusCode
	 *            the statusCode to set
	 */
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	/**
	 * @return the statusDescription
	 */
	public String getStatusDescription() {
		return statusDescription;
	}

	/**
	 * @param statusDescription
	 *            the statusDescription to set
	 */
	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}

	/**
	 * @return the carPackage
	 */
	public boolean isCarPackage() {
		return carPackage;
	}

	/**
	 * @param carPackage
	 *            the carPackage to set
	 */
	public void setCarPackage(boolean carPackage) {
		this.carPackage = carPackage;
	}

	/**
	 * @return the allInclusive
	 */
	public boolean isAllInclusive() {
		return allInclusive;
	}

	/**
	 * @param allInclusive
	 *            the allInclusive to set
	 */
	public void setAllInclusive(boolean allInclusive) {
		this.allInclusive = allInclusive;
	}

}
