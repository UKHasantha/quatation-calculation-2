package lk.arpico.calculation.quatationcalculation.dto;

public class UsersDTO {

	private String age;
	private String gender;
	private String occupation;
	private String type;
	
	private QuatationPlanDTO plan;
	private QuatationBenifitsDTO benifits;
	
	public UsersDTO() {
		super();
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public QuatationPlanDTO getPlan() {
		return plan;
	}

	public void setPlan(QuatationPlanDTO plan) {
		this.plan = plan;
	}

	public QuatationBenifitsDTO getBenifits() {
		return benifits;
	}

	public void setBenifits(QuatationBenifitsDTO benifits) {
		this.benifits = benifits;
	}

	@Override
	public String toString() {
		return "UsersDTO [age=" + age + ", gender=" + gender + ", occupation=" + occupation + ", type=" + type
				+ ", plan=" + plan + ", benifits=" + benifits + "]";
	}

	
}
