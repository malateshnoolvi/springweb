package com.xworkz.patient.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "patient_details")
@NamedQuery(name = "findByName", query = "select info from PatientDTO info where info.name=:nm")
@NamedQuery(name = "findByAge", query = "select info from PatientDTO info where info.age=:ag")
@NamedQuery(name = "findByEmail",query = "select info from PatientDTO info where info.email=:em")
@NamedQuery(name = "findByMobileNo",query = "select info from PatientDTO info where info.mobileNo=:mb")
public class PatientDTO {
	@Id
	private String name;
	private String email;
	private int age;
	private long mobileNo;
	private String gender;
	private String idProof;
	private String idValue;
	private String cardBPL;
	private String insurance;

	public PatientDTO() {
		System.out.println("created default constructor of patientDTO");
	}

	public PatientDTO(String name, String email, int age, long mobileNo, String gender, String idProof, String idValue,
			String cardBPL, String insurance) {
		super();
		this.name = name;
		this.email = email;
		this.age = age;
		this.mobileNo = mobileNo;
		this.gender = gender;
		this.idProof = idProof;
		this.idValue = idValue;
		this.cardBPL = cardBPL;
		this.insurance = insurance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getIdProof() {
		return idProof;
	}

	public void setIdProof(String idProof) {
		this.idProof = idProof;
	}

	public String getIdValue() {
		return idValue;
	}

	public void setIdValue(String idValue) {
		this.idValue = idValue;
	}

	public String getCardBPL() {
		return cardBPL;
	}

	public void setCardBPL(String cardBPL) {
		this.cardBPL = cardBPL;
	}

	public String getInsurance() {
		return insurance;
	}

	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}

	@Override
	public String toString() {
		return "PatientDTO [name=" + name + ", email=" + email + ", age=" + age + ", mobileNo=" + mobileNo + ", gender="
				+ gender + ", idProof=" + idProof + ", idValue=" + idValue + ", cardBPL=" + cardBPL + ", insurance="
				+ insurance + "]";
	}

}
