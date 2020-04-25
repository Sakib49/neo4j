package com.javatechie.spring.neo4j.api.node;

import java.util.List;


import org.neo4j.ogm.annotation.Id;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NodeEntity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Treatment {
	
	public Treatment() {
		// TODO Auto-generated constructor stub
		
		this.name = "Treatment";
	}
	public Treatment(int id, String name) {
		
		// TODO Auto-generated constructor stub
		this.name = "Chemotherapy";
		
	}
	@Id
	public int id;
	public String name; 
	public List<Treatment> treatments;

	@Relationship(type="IS_A", direction=Relationship.INCOMING)
	public List<Surgery> surgery;
	@Relationship(type="IS_A", direction=Relationship.INCOMING)
	public List<Radiotherapy> therapy;
	@Relationship(type="IS_A", direction=Relationship.INCOMING)
	public List<Chemotherapy> therapy1;
	@Relationship(type="IS_A", direction=Relationship.INCOMING)
	public List<Hormonaltherapy> therapy2;


}
