package com.javatechie.spring.neo4j.api.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.javatechie.spring.neo4j.api.node.Chemotherapy;


public interface ChemoRepository extends Neo4jRepository<Chemotherapy, Integer>{

}
