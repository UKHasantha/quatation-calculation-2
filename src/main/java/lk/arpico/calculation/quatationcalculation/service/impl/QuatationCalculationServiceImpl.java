package lk.arpico.calculation.quatationcalculation.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import lk.arpico.calculation.quatationcalculation.dto.ChildrenDTO;
import lk.arpico.calculation.quatationcalculation.dto.QuatationBenifitsDTO;
import lk.arpico.calculation.quatationcalculation.dto.QuatationCalculationDTO;
import lk.arpico.calculation.quatationcalculation.dto.QuatationPlanDTO;
import lk.arpico.calculation.quatationcalculation.dto.SummeryDTO;
import lk.arpico.calculation.quatationcalculation.dto.UsersDTO;
import lk.arpico.calculation.quatationcalculation.service.QuatationCalculationService;

@Service
public class QuatationCalculationServiceImpl implements QuatationCalculationService{
	
	
	UsersDTO main=new UsersDTO();
	ChildrenDTO child=new ChildrenDTO();
	UsersDTO spouse=new UsersDTO();
	
	//plan & benifits for mainLife...
	QuatationPlanDTO planMain=new QuatationPlanDTO();
	QuatationBenifitsDTO beniMain=new QuatationBenifitsDTO();
	
	//plan & benifits for child...
	QuatationPlanDTO planChild=new QuatationPlanDTO();
	QuatationBenifitsDTO beniChild=new QuatationBenifitsDTO();
	
	//plan & benifits for mainSpouse...
	QuatationPlanDTO planSpouse=new QuatationPlanDTO();
	QuatationBenifitsDTO beniSpouse=new QuatationBenifitsDTO();
	
	SummeryDTO sum1=new SummeryDTO();
	QuatationCalculationDTO calc=new QuatationCalculationDTO();
	

	@Override
	public UsersDTO saveMainLifeDTO(String age, String gender, String occupation, String type) {
		main.setAge(age);
		main.setGender(gender);
		main.setOccupation(occupation);
		main.setType(type);
		//catch null exception
		//plan or benifits not selected catch exception.
		try {
			if (planMain != null && beniMain !=null) {
				main.setPlan(saveMainPlan(planMain.getTerms(), planMain.getFrequency(), planMain.getPrice()));
				main.setBenifits(saveMainBenifits(beniMain.getRiders(), beniMain.getSumAssuarance()));
			}
		} catch (Exception e) {
			System.out.println("plan or benifits not selected...");
		}	
		System.out.println("Main :-"+main);
		return main;
	}

//	@Override
//	public UsersDTO saveChildrenDTO(String age, String gender, String type) {
//		child.setAge(age);
//		child.setGender(gender);
//		child.setType(type);
//		//catch null exception
//		//plan or benifits not selected catch exception.
//		try {
//			if (planChild != null && beniChild !=null) {
//				child.setPlan(saveChildPlan(planChild.getTerms(), planChild.getFrequency(), planChild.getPrice()));
//				child.setBenifits(saveChildBenifits(beniChild.getRiders(), beniChild.getSumAssuarance()));
//			}
//		} catch (Exception e) {
//			System.out.println("plan or benifits not selected...");
//		}	
//		System.out.println("Child :-"+child);
//		return child;
//	}

	@Override
	public UsersDTO saveSpouseDTO(String age, String gender, String occupation, String type) {
		spouse.setAge(age);
		spouse.setGender(gender);
		spouse.setOccupation(occupation);
		spouse.setType(type);
		//catch null exception
		//plan or benifits not selected catch exception.
		try {
			if (planSpouse != null && beniSpouse !=null) {
				spouse.setPlan(saveSpousePlan(planSpouse.getTerms(), planSpouse.getFrequency(), planSpouse.getPrice()));
				spouse.setBenifits(saveSpouseBenifits(beniSpouse.getRiders(), beniSpouse.getSumAssuarance()));
			}
		} catch (Exception e) {
			System.out.println("plan or benifits not selected...");
		}	
		System.out.println("Child :-"+spouse);
		return spouse;
	}


	@Override
	public QuatationPlanDTO saveMainPlan(List<String> terms, List<String> frequency, double price) {
		planMain.setTerms(terms);
		planMain.setFrequency(frequency);
		planMain.setPrice(price);
		System.out.println("Plan :-"+planMain);
		return planMain;
	}

	@Override
	public QuatationBenifitsDTO saveMainBenifits(List<String> riders, double sumAssuarance) {
		beniMain.setRiders(riders);
		beniMain.setSumAssuarance(sumAssuarance);
		System.out.println("Quatation :-"+beniMain);
		return beniMain;
	}

	@Override
	public QuatationPlanDTO saveChildPlan(List<String> terms, List<String> frequency, double price) {
		planChild.setTerms(terms);
		planChild.setFrequency(frequency);
		planChild.setPrice(price);
		System.out.println("Plan :-"+planChild);
		return planChild;
	}

	@Override
	public QuatationBenifitsDTO saveChildBenifits(List<String> riders, double sumAssuarance) {
		beniChild.setRiders(riders);
		beniChild.setSumAssuarance(sumAssuarance);
		System.out.println("Quatation :-"+beniChild);
		return beniChild;
	}

	@Override
	public QuatationPlanDTO saveSpousePlan(List<String> terms, List<String> frequency, double price) {
		planSpouse.setTerms(terms);
		planSpouse.setFrequency(frequency);
		planSpouse.setPrice(price);
		System.out.println("Plan :-"+planSpouse);
		return planSpouse;
	}

	@Override
	public QuatationBenifitsDTO saveSpouseBenifits(List<String> riders, double sumAssuarance) {
		beniSpouse.setRiders(riders);
		beniSpouse.setSumAssuarance(sumAssuarance);
		System.out.println("Quatation :-"+beniSpouse);
		return beniSpouse;
	}

	public SummeryDTO getSum() {
		SummeryDTO sum=new SummeryDTO();
		//children summery
		sum.setChildDTO(saveChildrenDTO(child.getChildrens(), child.getType()));
		//main summery
		sum.setMainDTO(saveMainLifeDTO(main.getAge(), main.getGender(), main.getOccupation(), main.getType()));
		//spouse summery
		sum.setSpouseDTO(saveSpouseDTO(spouse.getAge(), spouse.getGender(), spouse.getOccupation(), spouse.getType()));
		return sum;
	}

	@Override
	public QuatationCalculationDTO calculate() {
		//save all data to service bus
		QuatationCalculationDTO calcdto=new QuatationCalculationDTO();
		calcdto.setChildDTO(child);
		calcdto.setMainDTO(main);
		calcdto.setSpouseDTO(spouse);
		System.out.println("calc :-"+calcdto);
		return calcdto;
	}

	@Override
	public ChildrenDTO saveChildrenDTO(List<String> chiList, String type) {
		child.setChildrens(chiList);
		child.setType(type);
		try {
			if (planChild != null && beniChild !=null) {
				child.setPlan(saveChildPlan(planChild.getTerms(), planChild.getFrequency(), planChild.getPrice()));
				child.setBenifits(saveChildBenifits(beniChild.getRiders(), beniChild.getSumAssuarance()));
			}
		} catch (Exception e) {
			System.out.println("plan or benifits not selected...");
		}	
		System.out.println("Child :-"+child);
		return child;
	}
}
