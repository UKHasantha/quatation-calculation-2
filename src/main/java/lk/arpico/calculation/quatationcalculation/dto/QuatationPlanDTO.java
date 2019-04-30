package lk.arpico.calculation.quatationcalculation.dto;

import java.util.List;

public class QuatationPlanDTO {
	
	private List<String> terms;
	private List<String> frequency;
	private Double price;
	
	public QuatationPlanDTO() {
		super();
	}
	
	public QuatationPlanDTO(List<String> terms, List<String> frequency, Double price) {
		super();
		this.terms = terms;
		this.frequency = frequency;
		this.price = price;
	}

	public List<String> getTerms() {
		return terms;
	}

	public void setTerms(List<String> terms) {
		this.terms = terms;
	}

	public List<String> getFrequency() {
		return frequency;
	}

	public void setFrequency(List<String> frequency) {
		this.frequency = frequency;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "QuatationPlanDTO [terms=" + terms + ", frequency=" + frequency + ", price=" + price + "]";
	}
	
	

}
