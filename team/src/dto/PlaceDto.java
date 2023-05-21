package dto;


public class PlaceDto {
	private String placeName;
	private String minPrice;
	private String placeExplanation;
	public String getPlaceName() {
		return placeName;
	}
	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}
	public String getMinPrice() {
		return minPrice;
	}
	public void setMinPrice(String minPrice) {
		this.minPrice = minPrice;
	}
	public String getPlaceExplanation() {
		return placeExplanation;
	}
	public void setPlaceExplanation(String placeExplanation) {
		this.placeExplanation = placeExplanation;
	}
	public PlaceDto() {
	
	}
	
}
