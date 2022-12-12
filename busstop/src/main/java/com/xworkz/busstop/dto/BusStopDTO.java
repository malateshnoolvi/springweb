package com.xworkz.busstop.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BusStopDTO {

	private String name;
	private String location;
	private int capacity;
	private boolean maintenance;
	private int noOfFlatForms;
	private int noOfWorkers;

	public BusStopDTO(String name, String location, int capacity, boolean maintenance, int noOfFlatForms,
			int noOfWorkers) {
		super();
		this.name = name;
		this.location = location;
		this.capacity = capacity;
		this.maintenance = maintenance;
		this.noOfFlatForms = noOfFlatForms;
		this.noOfWorkers = noOfWorkers;
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

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public boolean isMaintenance() {
		return maintenance;
	}

	public void setMaintenance(boolean maintenance) {
		this.maintenance = maintenance;
	}

	public int getNoOfFlatForms() {
		return noOfFlatForms;
	}

	public void setNoOfFlatForms(int noOfFlatForms) {
		this.noOfFlatForms = noOfFlatForms;
	}

	public int getNoOfWorkers() {
		return noOfWorkers;
	}

	public void setNoOfWorkers(int noOfWorkers) {
		this.noOfWorkers = noOfWorkers;
	}

	@Override
	public String toString() {
		return "BusStopDTO [name=" + name + ", location=" + location + ", capacity=" + capacity + ", maintenance="
				+ maintenance + ", noOfFlatForms=" + noOfFlatForms + ", noOfWorkers=" + noOfWorkers + "]";
	}

}
