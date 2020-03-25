package com.moko.sw_ev.sw_emergency_version.model;

import java.util.UUID;

public class User {

	private UUID idUser;
	private Gender genderUser;
	private String firstNameUser;
	private String lastNameUser;
	private int ageUser;
	private String occupationUser;
	private Privilege privilegeUser;
	
	public User(UUID idUser, Gender genderUser, String firstNameUser, String lastNameUser, int ageUser, String occupationUser, Privilege privilegeUser) {
		this.idUser = idUser;
		this.genderUser = genderUser;
		this.firstNameUser = firstNameUser;
		this.lastNameUser = lastNameUser;
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
