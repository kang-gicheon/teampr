package dto;



public class BasketDto {
	private int BasketNo;
	private String prodName;
	private int price;
	protected int getBasketNo() {
		return BasketNo;
	}
	protected void setBasketNo(int basketNo) {
		BasketNo = basketNo;
	}
	protected String getProdName() {
		return prodName;
	}
	protected void setProdName(String prodName) {
		this.prodName = prodName;
	}
	protected int getPrice() {
		return price;
	}
	protected void setPrice(int price) {
		this.price = price;
	}
	public BasketDto() {
	
	}
	
	
}
