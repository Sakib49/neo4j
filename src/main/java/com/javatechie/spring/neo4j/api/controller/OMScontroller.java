package com.javatechie.spring.neo4j.api.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.neo4j.ogm.annotation.Relationship;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.spring.neo4j.api.node.Chemotherapy;
import com.javatechie.spring.neo4j.api.node.Hormonaltherapy;
import com.javatechie.spring.neo4j.api.node.Lung_cancer;
import com.javatechie.spring.neo4j.api.node.Radiotherapy;
import com.javatechie.spring.neo4j.api.node.Surgery;
import com.javatechie.spring.neo4j.api.node.Treatment;
import com.javatechie.spring.neo4j.api.repository.CustomerRepository;
import com.javatechie.spring.neo4j.api.repository.TreatmentRepository;

@RestController
public class OMScontroller {
	@Autowired
	private CustomerRepository repository;
	@Autowired
	private TreatmentRepository repository2;
	
	
    @PostConstruct
	public void purchaseOrder() {
		Lung_cancer cancer = new Lung_cancer();
		Treatment treatment = new Treatment();
		
		
		
		List<Treatment> treatments = new ArrayList<>(); 
		List<Surgery> surgery = new ArrayList<>(); 
		List<Radiotherapy> therapy = new ArrayList<>();
		List<Chemotherapy> therapy1 = new ArrayList<>();
		List<Hormonaltherapy> therapy2 = new ArrayList<>();

		

		treatments.add(new Treatment(116, "Chemotherapy"));
	    surgery.add(new Surgery(112, "nam"));
	    therapy.add(new Radiotherapy(114, "eeee"));
	    therapy1.add(new Chemotherapy(123, "ppp"));
	    therapy2.add(new Hormonaltherapy(133, "p2p"));
	    
	    cancer.cid = 111;
	    cancer.name = "Lungcancer";
	   
	   
	    cancer.treatments = treatments;
	    treatment.surgery = surgery;
	    treatment.therapy = therapy;
	    treatment.therapy1 = therapy1;
	    treatment.therapy2 = therapy2;
	    
	    repository.deleteAll();
	    repository2.deleteAll();
	    repository.save(cancer);
	    repository2.save(treatment);

}
    @GetMapping("/getOrders")
    public List<Lung_cancer> getOrder(){
    	return (List<Lung_cancer>) repository.findAll();
    }
   
    
}