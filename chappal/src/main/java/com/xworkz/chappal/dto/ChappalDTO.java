package com.xworkz.chappal.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name = "chappal")
public class ChappalDTO {
	@Id
	private String brand;
	private double price;
	private String color;
	private int size;
	private String gender;

	public ChappalDTO(String brand, double price, String color, int size, String gender) {
		super();
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.size = size;
		this.gender = gender;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "ChappalDTO [brand=" + brand + ", price=" + price + ", color=" + color + ", size=" + size + ", gender="
				+ gender + "]";
	}

}
