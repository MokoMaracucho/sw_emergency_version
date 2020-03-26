package com.moko.sw_ev.sw_emergency_version.model;

import java.util.UUID;

import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {

	private UUID idUser;
	@NotBlank
	private Gender genderUser;
	@NotBlank
	private String firstNameUser;
	@NotBlank
	private String lastNameUser;
	@NotBlank
	private String emailUser;
	@NotBlank
	private int ageUser;
	@NotBlank
	private String occupationUser;
	@NotBlank
	private Privilege privilegeUser;
	
	public User(
		@JsonProperty("idUtilisateur") UUID idUser,
		@JsonProperty("genderUser") Gender genderUser,
		@JsonProperty("firstNameUser") String firstNameUser,
		@JsonProperty("lastNameUser") String lastNameUser,
		@JsonProperty("emailUser") String emailUser,
		@JsonProperty("ageUser") int ageUser,
		@JsonProperty("occupationUser") String occupationUser,
		@JsonProperty("privilegeUser") Privilege privilegeUser
	) {
		this.idUser = idUser;
		this.genderUser = genderUser;
		this.firstNameUser = firstNameUser;
		this.lastNameUser = lastNameUser;
		this.emailUser = emailUser;
		this.ageUser = ageUser;
		this.occupationUser = occupationUser;
		this.privilegeUser = privilegeUser;
	}

	public UUID getIdUser() {
		return idUser;
	}

	public void setIdUser(UUID idUser) {
		this.idUser = idUser;
	}

	public Gender getGenderUser() {
		return genderUser;
	}

	public void setGenderUser(Gender genderUser) {
		this.genderUser = genderUser;
	}

	public String getFirstNameUser() {
		return firstNameUser;
	}

	public void setFirstNameUser(String firstNameUser) {
		this.firstNameUser = firstNameUser;
	}

	public String getLastNameUser() {
		return lastNameUser;
	}

	public void setLastNameUser(String lastNameUser) {
		this.lastNameUser = lastNameUser;
	}
	
	public String getEmailUser() {
		return emailUser;
	}

	public void setEmailUser(String emailUser) {
		this.emailUser = emailUser;
	}

	public int getAgeUser() {
		return ageUser;
	}

	public void setAgeUser(int ageUser) {
		this.ageUser = ageUser;
	}

	public String getOccupationUser() {
		return occupationUser;
	}

	public void setOccupationUser(String occupationUser) {
		this.occupationUser = occupationUser;
	}

	public Privilege getPrivilegeUser() {
		return privilegeUser;
	}

	public void setPrivilegeUser(Privilege privilegeUser) {
		this.privilegeUser = privilegeUser;
	}
}
