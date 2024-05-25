package com.hcl.employee.parking.Response;

public class ParkingSpotsDto {
	private String parkingAlotId;
	private String leaveStarDate;
	private String leaveEndDate;
	private String leaveSatus;
	public String getParkingAlotId() {
		return parkingAlotId;
	}
	public void setParkingAlotId(String parkingAlotId) {
		this.parkingAlotId = parkingAlotId;
	}
	public String getLeaveStarDate() {
		return leaveStarDate;
	}
	public void setLeaveStarDate(String leaveStarDate) {
		this.leaveStarDate = leaveStarDate;
	}
	public String getLeaveEndDate() {
		return leaveEndDate;
	}
	public void setLeaveEndDate(String leaveEndDate) {
		this.leaveEndDate = leaveEndDate;
	}
	public String getLeaveSatus() {
		return leaveSatus;
	}
	public void setLeaveSatus(String leaveSatus) {
		this.leaveSatus = leaveSatus;
	}
	

}
