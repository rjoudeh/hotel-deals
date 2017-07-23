package com.hotel.model;

import org.joda.time.LocalTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.joda.deser.LocalTimeDeserializer;

public class HotelUrgencyInfo {

	private long airAttachRemainingTime;
	private long numberOfPeopleViewing;
	private long numberOfPeopleBooked;
	private long numberOfRoomsLeft;
	@JsonDeserialize(using = LocalTimeDeserializer.class)
	@JsonFormat( pattern = "s")
	private LocalTime lastBookedTime;
	private String almostSoldStatus;
	private String link;
	private Object almostSoldOutRoomTypeInfoCollection;
	private boolean airAttachEnabled;

	/**
	 * @return the airAttachRemainingTime
	 */
	public long getAirAttachRemainingTime() {
		return airAttachRemainingTime;
	}

	/**
	 * @param airAttachRemainingTime
	 *            the airAttachRemainingTime to set
	 */
	public void setAirAttachRemainingTime(long airAttachRemainingTime) {
		this.airAttachRemainingTime = airAttachRemainingTime;
	}

	/**
	 * @return the numberOfPeopleViewing
	 */
	public long getNumberOfPeopleViewing() {
		return numberOfPeopleViewing;
	}

	/**
	 * @param numberOfPeopleViewing
	 *            the numberOfPeopleViewing to set
	 */
	public void setNumberOfPeopleViewing(long numberOfPeopleViewing) {
		this.numberOfPeopleViewing = numberOfPeopleViewing;
	}

	/**
	 * @return the numberOfPeopleBooked
	 */
	public long getNumberOfPeopleBooked() {
		return numberOfPeopleBooked;
	}

	/**
	 * @param numberOfPeopleBooked
	 *            the numberOfPeopleBooked to set
	 */
	public void setNumberOfPeopleBooked(long numberOfPeopleBooked) {
		this.numberOfPeopleBooked = numberOfPeopleBooked;
	}

	/**
	 * @return the numberOfRoomsLeft
	 */
	public long getNumberOfRoomsLeft() {
		return numberOfRoomsLeft;
	}

	/**
	 * @param numberOfRoomsLeft
	 *            the numberOfRoomsLeft to set
	 */
	public void setNumberOfRoomsLeft(long numberOfRoomsLeft) {
		this.numberOfRoomsLeft = numberOfRoomsLeft;
	}

	/**
	 * @return the lastBookedTime
	 */
	public LocalTime getLastBookedTime() {
		return lastBookedTime;
	}

	/**
	 * @param lastBookedTime
	 *            the lastBookedTime to set
	 */
	public void setLastBookedTime(LocalTime lastBookedTime) {
		this.lastBookedTime = lastBookedTime;
	}

	/**
	 * @return the almostSoldStatus
	 */
	public String getAlmostSoldStatus() {
		return almostSoldStatus;
	}

	/**
	 * @param almostSoldStatus
	 *            the almostSoldStatus to set
	 */
	public void setAlmostSoldStatus(String almostSoldStatus) {
		this.almostSoldStatus = almostSoldStatus;
	}

	/**
	 * @return the link
	 */
	public String getLink() {
		return link;
	}

	/**
	 * @param link
	 *            the link to set
	 */
	public void setLink(String link) {
		this.link = link;
	}

	/**
	 * @return the almostSoldOutRoomTypeInfoCollection
	 */
	public Object getAlmostSoldOutRoomTypeInfoCollection() {
		return almostSoldOutRoomTypeInfoCollection;
	}

	/**
	 * @param almostSoldOutRoomTypeInfoCollection
	 *            the almostSoldOutRoomTypeInfoCollection to set
	 */
	public void setAlmostSoldOutRoomTypeInfoCollection(Object almostSoldOutRoomTypeInfoCollection) {
		this.almostSoldOutRoomTypeInfoCollection = almostSoldOutRoomTypeInfoCollection;
	}

	/**
	 * @return the airAttachEnabled
	 */
	public boolean isAirAttachEnabled() {
		return airAttachEnabled;
	}

	/**
	 * @param airAttachEnabled
	 *            the airAttachEnabled to set
	 */
	public void setAirAttachEnabled(boolean airAttachEnabled) {
		this.airAttachEnabled = airAttachEnabled;
	}

}
