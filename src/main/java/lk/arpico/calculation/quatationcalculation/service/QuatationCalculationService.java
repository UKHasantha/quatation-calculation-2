package lk.arpico.calculation.quatationcalculation.service;

import lk.arpico.calculation.quatationcalculation.dto.ChildrenDTO;
import lk.arpico.calculation.quatationcalculation.dto.QuatationBenifitsDTO;
import lk.arpico.calculation.quatationcalculation.dto.QuatationCalculationDTO;
import lk.arpico.calculation.quatationcalculation.dto.QuatationPlanDTO;
import lk.arpico.calculation.quatationcalculation.dto.SummeryDTO;
import lk.arpico.calculation.quatationcalculation.dto.UsersDTO;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public interface QuatationCalculationService {

	//childrenDTO
	public ChildrenDTO saveChildrenDTO(List<String> chiList,String type);
	//spouseDTO
	public UsersDTO saveSpouseDTO(String age, String gender, String occupation, String type);
	//mainDTO
	public UsersDTO saveMainLifeDTO(String age, String gender, String occupation, String type);
	
	//mainlife plan & benifits
	public QuatationPlanDTO saveMainPlan(List<String> terms,List<String> frequency, double price);
	public QuatationBenifitsDTO saveMainBenifits(List<String> riders, double sumAssuarance);
	
	//childrens plan & benifits
	public QuatationPlanDTO saveChildPlan(List<String> terms,List<String> frequency, double price);
	public QuatationBenifitsDTO saveChildBenifits(List<String> riders, double sumAssuarance);
	
	//spouse plan & benifits
	public QuatationPlanDTO saveSpousePlan(List<String> terms,List<String> frequency, double price);
	public QuatationBenifitsDTO saveSpouseBenifits(List<String> riders, double sumAssuarance);
	
	public SummeryDTO getSum();
	public QuatationCalculationDTO calculate();
}
