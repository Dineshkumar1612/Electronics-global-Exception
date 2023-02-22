package com.electronics.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.electronics.*;
import com.electronics.Entity.Watch;
import com.electronics.Service.WatchService;
import com.electronics.customeException.UnchangeableException;

import jakarta.servlet.UnavailableException;

@RestController
@RequestMapping(value="/watch")
public class WatchController {
	
	@Autowired
	WatchService ws;
	
	@PostMapping(value="/setAllObj") 
	public String setAllObj(@RequestBody List<Watch> w) {
		return ws.setAllObj(w);
	}
	@PutMapping(value="/update/{id}")
	public String update(@RequestBody Watch w,@PathVariable int id) throws UnavailableException, UnchangeableException {
		return ws.update(w,id);
	}
	@PostMapping(value="/setObj")
	public String setObj(@RequestBody Watch w) throws NullPointerException {
		return ws.setObj(w);
	}
	@GetMapping(value="/getById/{a}")
	public Watch getById(@PathVariable int a) {
		return ws.getById(a);
	}

}
