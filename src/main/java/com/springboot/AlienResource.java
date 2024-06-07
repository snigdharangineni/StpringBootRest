package com.springboot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlienResource {
	
	@Autowired
	AlienRepositry repo;
	
	@GetMapping("aliens")
	public List<Alien> getAliens()
	{
		List<Alien> aliens = (List<Alien>) repo.findAll();
		
		
		return aliens;
	}
}
