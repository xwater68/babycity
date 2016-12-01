package com.babycity.dao;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.babycity.entity.Play;

public interface PlayDao extends Repository<Play, Long>{
	public List<Play> findAll();
	
	public Play findById(Long id);
}
