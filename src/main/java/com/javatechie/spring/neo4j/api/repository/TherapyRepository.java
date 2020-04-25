package com.javatechie.spring.neo4j.api.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.javatechie.spring.neo4j.api.node.Radiotherapy;

public interface TherapyRepository extends Neo4jRepository<Radiotherapy, Integer>{

}
