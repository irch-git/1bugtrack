package com.bugtrack.Practice1.dao;

import org.springframework.data.repository.CrudRepository;

import com.bugtrack.Practice1.entities.MemberEntities;

public interface IMemberRepository extends CrudRepository<MemberEntities, Long>{

	
	
}
