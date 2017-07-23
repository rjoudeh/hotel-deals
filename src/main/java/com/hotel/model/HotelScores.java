package com.hotel.model;

/**
 * 
 * @author rania
 *
 */
public class HotelScores {
	private float rawAppealScore;
	private float movingAverageScore;

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
}
