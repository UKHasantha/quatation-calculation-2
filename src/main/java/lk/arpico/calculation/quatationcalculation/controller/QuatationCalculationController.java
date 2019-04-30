package lk.arpico.calculation.quatationcalculation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.arpico.calculation.quatationcalculation.dto.ChildrenDTO;
import lk.arpico.calculation.quatationcalculation.dto.QuatationBenifitsDTO;
import lk.arpico.calculation.quatationcalculation.dto.QuatationCalculationDTO;
import lk.arpico.calculation.quatationcalculation.dto.QuatationPlanDTO;
import lk.arpico.calculation.quatationcalculation.dto.SummeryDTO;
import lk.arpico.calculation.quatationcalculation.dto.UsersDTO;
import lk.arpico.calculation.quatationcalculation.service.QuatationCalculationService;

@RestController
@CrossOrigin
@RequestMapping("api/v1/cals")
public class QuatationCalculationController {
	
	@Autowired
	private QuatationCalculationService calculationService;
	
	//call mainDTO..
	@PostMapping("/main")
	public UsersDTO saveMain(@RequestBody UsersDTO main) {
		return calculationService.saveMainLifeDTO(main.getAge(),main.getGender(),main.getOccupation(),main.getType());		
	}
	
	//call childrenDTO..
	@PostMapping("/child")
	public ChildrenDTO saveChild(@RequestBody ChildrenDTO child) {
		return calculationService.saveChildrenDTO(child.getChildrens(),child.getType());		
	}
	
	//call spouseDTO
	@PostMapping("/spouse")
	public UsersDTO saveSpouse(@RequestBody UsersDTO spouse) {
		return calculationService.saveSpouseDTO(spouse.getAge(),spouse.getGender(),spouse.getOccupation(),spouse.getType());		
	}
	
	//call to main life plans 
	@PostMapping("/mainPlan")
	public QuatationPlanDTO saveMainPlan(@RequestBody QuatationPlanDTO plan) {
		return calculationService.saveMainPlan(plan.getTerms(), plan.getFrequency(), plan.getPrice());	
	}
	
	//call to main life benifits 
	@PostMapping("/mainBeni")
	public QuatationBenifitsDTO saveMainBenifits(@RequestBody QuatationBenifitsDTO quat) {
		return calculationService.saveMainBenifits(quat.getRiders(), quat.getSumAssuarance());
	}
	
	//call to child life plans 
	@PostMapping("/childPlan")
	public QuatationPlanDTO saveChildPlan(@RequestBody QuatationPlanDTO plan) {
		return calculationService.saveChildPlan(plan.getTerms(), plan.getFrequency(), plan.getPrice());	
	}
	
	//call to child life benifits 
	@PostMapping("/childBeni")
	public QuatationBenifitsDTO saveChildBenifits(@RequestBody QuatationBenifitsDTO quat) {
		return calculationService.saveChildBenifits(quat.getRiders(), quat.getSumAssuarance());
	}
	
	//call to spouse life plan
	@PostMapping("/spousePlan")
	public QuatationPlanDTO saveSpousePlan(@RequestBody QuatationPlanDTO plan) {
		return calculationService.saveSpousePlan(plan.getTerms(), plan.getFrequency(), plan.getPrice());	
	}
	
	//call to spouse life beni 
	@PostMapping("/spouseBeni")
	public QuatationBenifitsDTO saveSpouseBenifits(@RequestBody QuatationBenifitsDTO quat) {
		return calculationService.saveSpouseBenifits(quat.getRiders(), quat.getSumAssuarance());
	}
	
	@GetMapping("/sum")
	public SummeryDTO getSum() {
		return calculationService.getSum();
		
	}
	@PostMapping("/saveAll")
	public QuatationCalculationDTO postData() {
		return calculationService.calculate();
	}
	
}
