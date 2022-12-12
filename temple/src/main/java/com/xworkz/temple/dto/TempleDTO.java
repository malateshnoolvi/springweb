package com.xworkz.temple.dto;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;

public class TempleDTO implements Serializable {

	private String name;
	private String location;
	private String mainGod;
	private int pincode;
	private double fees;
	private double openingTime;
	private double closingTime;

	public TempleDTO(String name, String location, String mainGod, int pincode, double fees, double openingTime,
			double closingTime) {
		super();
		this.name = name;
		this.location = location;
		this.mainGod = mainGod;
		this.pincode = pincode;
		this.fees = fees;
		this.openingTime = openingTime;
		this.closingTime = closingTime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getMainGod() {
		return mainGod;
	}

	public void setMainGod(String mainGod) {
		this.mainGod = mainGod;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public double getOpeningTime() {
		return openingTime;
	}

	public void setOpeningTime(double openingTime) {
		this.openingTime = openingTime;
	}

	public double getClosingTime() {
		return closingTime;
	}

	public void setClosingTime(double closingTime) {
		this.closingTime = closingTime;
	}

	@Override
	public String toString() {
		return "TempleDTO [name=" + name + ", location=" + location + ", mainGod=" + mainGod + ", pincode=" + pincode
				+ ", fees=" + fees + ", openingTime=" + openingTime + ", closingTime=" + closingTime + "]";
	}

}
