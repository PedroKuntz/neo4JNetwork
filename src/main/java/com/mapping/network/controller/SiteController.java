package com.mapping.network.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mapping.network.model.Site;
import com.mapping.network.service.SiteService;

@RestController
public class SiteController {

	@Autowired
	SiteService service;
	
	@GetMapping("/site")
	@ResponseBody
	public Iterable<Site> getSite(){
		return service.getSite();
	}
	
}
