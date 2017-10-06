package com.mapping.network.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapping.network.model.Site;
import com.mapping.network.repository.SiteRepository;

@Service
public class SiteService {

	@Autowired
	SiteRepository repo;
	
	public Iterable<Site> getSite(){
		return repo.findAll();
	}
}
