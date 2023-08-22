package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.model;
import com.example.demo.repo.repo;

@Service
public class service {
	
	@Autowired
	repo er;
	
	public model saveinfo(model e) {
		return er.save(e);
		
	}
	
	public List<model> showinfo() {
		return er.findAll();
		
	}
	
}