package lk.arpico.calculation.quatationcalculation.dto;

public class SummeryDTO {
	
	private UsersDTO mainDTO;
	private ChildrenDTO childDTO;
	private UsersDTO spouseDTO;
	
	public SummeryDTO() {
		super();
	}

	public SummeryDTO(UsersDTO mainDTO, ChildrenDTO childDTO, UsersDTO spouseDTO) {
		super();
		this.mainDTO = mainDTO;
		this.childDTO = childDTO;
		this.spouseDTO = spouseDTO;
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

	@Override
	public String toString() {
		return "SummeryDTO [mainDTO=" + mainDTO + ", childDTO=" + childDTO + ", spouseDTO=" + spouseDTO + "]";
	}
	
}
