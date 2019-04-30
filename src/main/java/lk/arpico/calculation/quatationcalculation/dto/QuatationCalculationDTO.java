package lk.arpico.calculation.quatationcalculation.dto;

public class QuatationCalculationDTO {
	
	private UsersDTO mainDTO;
	private ChildrenDTO childDTO;
	private UsersDTO spouseDTO;
	private Double price;
	private Double sumAssuarance;
	
	public QuatationCalculationDTO() {
		super();
	}

	public QuatationCalculationDTO(UsersDTO mainDTO, ChildrenDTO childDTO, UsersDTO spouseDTO, Double price,
			Double sumAssuarance) {
		super();
		this.mainDTO = mainDTO;
		this.childDTO = childDTO;
		this.spouseDTO = spouseDTO;
		this.price = price;
		this.sumAssuarance = sumAssuarance;
	}

	public UsersDTO getMainDTO() {
		return mainDTO;
	}

	public void setMainDTO(UsersDTO mainDTO) {
		this.mainDTO = mainDTO;
	}

	public ChildrenDTO getChildDTO() {
		return childDTO;
	}

	public void setChildDTO(ChildrenDTO childDTO) {
		this.childDTO = childDTO;
	}

	public UsersDTO getSpouseDTO() {
		return spouseDTO;
	}

	public void setSpouseDTO(UsersDTO spouseDTO) {
		this.spouseDTO = spouseDTO;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getSumAssuarance() {
		return sumAssuarance;
	}

	public void setSumAssuarance(Double sumAssuarance) {
		this.sumAssuarance = sumAssuarance;
	}

	@Override
	public String toString() {
		return "QuatationCalculationDTO [mainDTO=" + mainDTO + ", childDTO=" + childDTO + ", spouseDTO=" + spouseDTO
				+ ", price=" + price + ", sumAssuarance=" + sumAssuarance + "]";
	}

	
}
