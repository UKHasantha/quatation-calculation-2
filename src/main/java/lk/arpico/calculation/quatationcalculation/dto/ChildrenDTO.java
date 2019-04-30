package lk.arpico.calculation.quatationcalculation.dto;

import java.util.List;

public class ChildrenDTO {
	
	private List<String> childrens;
	private String type;
	
	private QuatationPlanDTO plan;
	private QuatationBenifitsDTO benifits;
	
	public ChildrenDTO() {
		super();
	}

	public ChildrenDTO(List<String> childrens, String type, QuatationPlanDTO plan, QuatationBenifitsDTO benifits) {
		super();
		this.childrens = childrens;
		this.type = type;
		this.plan = plan;
		this.benifits = benifits;
	}

	public List<String> getChildrens() {
		return childrens;
	}

	public void setChildrens(List<String> childrens) {
		this.childrens = childrens;
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
		return "ChildrenDTO [childrens=" + childrens + ", type=" + type + ", plan=" + plan + ", benifits=" + benifits
				+ "]";
	}
}
