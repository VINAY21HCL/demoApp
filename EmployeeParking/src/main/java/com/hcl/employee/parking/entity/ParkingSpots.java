package com.hcl.employee.parking.entity;

import java.io.Serializable;
import java.time.LocalDate;

import com.hcl.employee.parking.AvailableStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ParkingSpots  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String parkingLotId;
	@Column
	private LocalDate leaveStartdate;
	@Column
	private LocalDate leaveEndDate;
	@Column
	private AvailableStatus status; 

}
