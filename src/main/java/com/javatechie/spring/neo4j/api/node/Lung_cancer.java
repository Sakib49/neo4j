package com.javatechie.spring.neo4j.api.node;

import java.util.List;


import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.Relationship;
import org.neo4j.ogm.annotation.NodeEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NodeEntity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Lung_cancer {
	@Id
	public int cid;
	public String name;
	
	@Relationship(type="treatedby", direction=Relationship.OUTGOING)
	public List<Treatment> treatments;
	
	

}
