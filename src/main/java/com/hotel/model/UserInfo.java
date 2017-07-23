package com.hotel.model;

 /**
 * 
 * @author rania
 *
 */
public class UserInfo {
	private String userId;	
	private Person persona;

	/**
	 * @return the persona
	 */
	public Person getPersona() {
		return persona;
	}

	/**
	 * @param persona the persona to set
	 */
	public void setPersona(Person persona) {
		this.persona = persona;
	}

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public static class Person {
		private String personaType;

		/**
		 * @return the personaType
		 */
		public String getPersonaType() {
			return personaType;
		}

		/**
		 * @param personaType the personaType to set
		 */
		public void setPersonaType(String personaType) {
			this.personaType = personaType;
		}
	}
}
