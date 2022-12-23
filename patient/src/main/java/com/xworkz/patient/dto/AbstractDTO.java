package com.xworkz.patient.dto;

import java.time.LocalDate;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class AbstractDTO {

	private String createdBy = "Malatesh";
	private LocalDate localdate=LocalDate.now();

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDate getLocaldate() {
		return localdate;
	}

	public void setLocaldate(LocalDate localdate) {
		this.localdate = localdate;
	}

	@Override
	public String toString() {
		return "AbstractDTO [createdBy=" + createdBy + ", localdate=" + localdate + "]";
	}
}
