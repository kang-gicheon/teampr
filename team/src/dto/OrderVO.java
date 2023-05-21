package dto;

import java.util.Date;

public class OrderVO {
	private int orderNo;
	private String userName;
	private String orderName;
	private int payMoney;
	private Date payDate;
	public OrderVO(int orderNo, String userName, String orderName, int payMoney, Date payDate) {
		super();
		this.orderNo = orderNo;
		this.userName = userName;
		this.orderName = orderName;
		this.payMoney = payMoney;
		this.payDate = payDate;
	}
	protected int getOrderNo() {
		return orderNo;
	}
	protected void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}
	protected String getUserName() {
		return userName;
	}
	protected void setUserName(String userName) {
		this.userName = userName;
	}
	protected String getOrderName() {
		return orderName;
	}
	protected void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	protected int getPayMoney() {
		return payMoney;
	}
	protected void setPayMoney(int payMoney) {
		this.payMoney = payMoney;
	}
	protected Date getPayDate() {
		return payDate;
	}
	protected void setPayDate(Date payDate) {
		this.payDate = payDate;
	}
	public OrderVO() {
		
	}

}

enum payStatus{T, F}


