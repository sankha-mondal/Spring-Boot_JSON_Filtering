package com.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.JsonFilter;

@RestController  //  localhost:8585
public class JsonFilter_Controller {

	// http://localhost:8585/filtering
	@GetMapping("/filtering")
	public JsonFilter filtering() {
		return new JsonFilter("Sankha", "S@123", "Kolkata");
	}
	
	
	// http://localhost:8585/filtering_list
	@GetMapping("/filtering_list")
	public List<JsonFilter> filtering_list()  {
		return Arrays.asList(new JsonFilter("Sankha", "S@123", "Kolkata"),
							 new JsonFilter("Akash", "A@123", "Chennai"),
							 new JsonFilter("Vijay", "V@123", "Bangalore"));
	}
}
