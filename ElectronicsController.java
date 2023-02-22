package com.electronics.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.electronics.Entity.Electronics;
import com.electronics.Service.ElectronicsService;

@RestController
@RequestMapping(value="/electronics")
public class ElectronicsController {
	
	@Autowired
	ElectronicsService es;
	
	@PostMapping(value="/setObj")
	public String setObj(@RequestBody Electronics e) {
		return es.setObj(e);
	}
	@PostMapping(value="/setAllObj")
	public String setAllObj(@RequestBody List<Electronics>e) {
		return es.setAllObj(e);
	}
	@GetMapping(value="/getEvenBrand")
	public List<Electronics> getEvenBrand() {
		return es.getEvenBrand();
	}
	@GetMapping(value="/getMaxObj") 
	public Electronics getmaxObj() {
		return es.getMaxObj();
	}
	@GetMapping(value="/getAllObj")
	public List<Electronics> getAllObj() {
	    	return es.getAllObj();
	}
	@GetMapping(value="/getMaxBrandObj") 
	public Electronics getMaxBrandObj() {
		return es.getMaxBrandObj();
	}

}
