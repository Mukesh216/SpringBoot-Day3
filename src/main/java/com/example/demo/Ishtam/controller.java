package com.example.demo.Ishtam;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.model;
import com.example.demo.service.service;


@RestController
public class controller {
	
	@Autowired
	service sr;
	
	@GetMapping("/")
	public List<model> show(){
		return sr.showinfo();
	}
	@PostMapping("post")
	public model add(@RequestBody model e) {
		return sr.saveinfo(e);
	}
}