package com.xworkz.bikeshowroom.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "bikeshowroom")
public class BikeShowRoomDTO {
	@Id
	private String brand;
	private String ownerName;
	private String location;
	private String ambassador;
	private String description;

	public BikeShowRoomDTO() {
		System.out.println("created default constructor of bikeshowroomdto.....");
	}

	public BikeShowRoomDTO(String brand, String ownerName, String location, String ambassador, String description) {
		super();
		this.brand = brand;
		this.ownerName = ownerName;
		this.location = location;
		this.ambassador = ambassador;
		this.description = description;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getAmbassador() {
		return ambassador;
	}

	public void setAmbassador(String ambassador) {
		this.ambassador = ambassador;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "BikeShowRoomDTO [brand=" + brand + ", ownerName=" + ownerName + ", location=" + location
				+ ", ambassador=" + ambassador + ", description=" + description + "]";
	}

}
