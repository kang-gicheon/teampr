package dto;

import java.util.Date;


public class AirPlaneDto {
	private Date startDate;
	private String time;
	private int flightTime;
	private String company;
	private int price;
	private int quantity;
	protected Date getStartDate() {
		return startDate;
	}
	protected void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	protected String getTime() {
		return time;
	}
	protected void setTime(String time) {
		this.time = time;
	}
	protected int getFlightTime() {
		return flightTime;
	}
	protected void setFlightTime(int flightTime) {
		this.flightTime = flightTime;
	}
	protected String getCompany() {
		return company;
	}
	protected void setCompany(String company) {
		this.company = company;
	}
	protected int getPrice() {
		return price;
	}
	protected void setPrice(int price) {
		this.price = price;
	}
	protected int getQuantity() {
		return quantity;
	}
	protected void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public AirPlaneDto() {
		
	}
	
	
}
