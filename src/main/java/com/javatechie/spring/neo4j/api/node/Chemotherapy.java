package com.javatechie.spring.neo4j.api.node;

import java.util.List;



import org.neo4j.ogm.annotation.Id;

import org.neo4j.ogm.annotation.NodeEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NodeEntity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Chemotherapy {
	public Chemotherapy(int id, String name) {
		// TODO Auto-generated constructor stub
	}
	@Id
	public int id;
	public String name;
	public List<Chemotherapy> therapy1;

}
