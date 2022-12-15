package com.xworkz.oyo.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name = "oyo")
public class OyoDTO {
	@Id
	private String ownerName;
	private int roomRent;
	private int noOfRooms;
	private int area;
	private boolean maintenance;
	private boolean camera;
	private int roomNo;
	private boolean airCondition;
	private boolean service;

	public OyoDTO() {
		System.out.println("created default constructor of oyo.....");
	}

	public OyoDTO(String ownerName, int roomRent, int noOfRooms, int area, boolean maintenance, boolean camera,
			int roomNo, boolean airCondition, boolean service) {
		super();
		this.ownerName = ownerName;
		this.roomRent = roomRent;
		this.noOfRooms = noOfRooms;
		this.area = area;
		this.maintenance = maintenance;
		this.camera = camera;
		this.roomNo = roomNo;
		this.airCondition = airCondition;
		this.service = service;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getRoomRent() {
		return roomRent;
	}

	public void setRoomRent(int roomRent) {
		this.roomRent = roomRent;
	}

	public int getNoOfRooms() {
		return noOfRooms;
	}

	public void setNoOfRooms(int noOfRooms) {
		this.noOfRooms = noOfRooms;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public boolean isMaintenance() {
		return maintenance;
	}

	public void setMaintenance(boolean maintenance) {
		this.maintenance = maintenance;
	}

	public boolean isCamera() {
		return camera;
	}

	public void setCamera(boolean camera) {
		this.camera = camera;
	}

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public boolean isAirCondition() {
		return airCondition;
	}

	public void setAirCondition(boolean airCondition) {
		this.airCondition = airCondition;
	}

	public boolean isService() {
		return service;
	}

	public void setService(boolean service) {
		this.service = service;
	}

	@Override
	public String toString() {
		return "OyoDTO [ownerName=" + ownerName + ", roomRent=" + roomRent + ", noOfRooms=" + noOfRooms + ", area="
				+ area + ", maintenance=" + maintenance + ", camera=" + camera + ", roomNo=" + roomNo
				+ ", airCondition=" + airCondition + ", service=" + service + "]";
	}

}
