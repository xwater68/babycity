package com.babycity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.babycity.dao.PlayDao;
import com.babycity.entity.Play;

@Component("playService")
@Transactional
public class PlayService {
	
	@Autowired
	private PlayDao playDao;
	
	public List<Play> list(){
		return playDao.findAll();
	}
}
