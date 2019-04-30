package lk.arpico.calculation.quatationcalculation.dto;

import java.util.List;

public class QuatationBenifitsDTO {
	
	private List<String> riders;
	private Double sumAssuarance;
	
	public QuatationBenifitsDTO() {
		super();
	}

	public QuatationBenifitsDTO(List<String> riders, Double sumAssuarance) {
		super();
		this.riders = riders;
		this.sumAssuarance = sumAssuarance;
	}

	public List<String> getRiders() {
		return riders;
	}

	public void setRiders(List<String> riders) {
		this.riders = riders;
	}

	public Double getSumAssuarance() {
		return sumAssuarance;
	}

	public void setSumAssuarance(Double sumAssuarance) {
		this.sumAssuarance = sumAssuarance;
	}

	@Override
	public String toString() {
		return "QuatationBenifitsDTO [riders=" + riders + ", sumAssuarance=" + sumAssuarance + "]";
	}
	
	

}
