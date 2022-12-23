package com.xworkz.bikeshowroom.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "bikeshowroom")
@NamedQuery(name = "findByBrand",query = "select bs from BikeShowRoomDTO bs where bs.brand=:br")
public class BikeShowRoomDTO {
	@Id
	@NotEmpty
	@NotNull
	@Length(min = 3, max = 30, message = "Invalid brand")
	private String brand;
	@NotEmpty
	@NotNull
	@Length(min = 3, max = 30, message = "Invalid ownerName")
	private String ownerName;
	@NotEmpty
	@NotNull
	@Length(min = 3, max = 30, message = "Invalid location")
	private String location;
	@NotEmpty
	@NotNull
	@Length(min = 3, max = 30, message = "Invalid ambassador")
	private String ambassador;
	@NotEmpty
	@NotNull
	@Length(min = 3, max = 30, message = "Invalid description")
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
