package com.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.JsonFilter;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController  //  localhost:8585
public class JsonFilter_Controller {

	// http://localhost:8585/filtering
	@GetMapping("/filtering")
	public MappingJacksonValue filtering() {
		
		JsonFilter jf = new JsonFilter("Sankha", "S@123", "Kolkata");
		MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(jf);
		
		SimpleBeanPropertyFilter filter = 
				SimpleBeanPropertyFilter.filterOutAllExcept("name","location");
		
		FilterProvider provider =
				new SimpleFilterProvider().addFilter("SomeBeanFilter", filter);
		
		mappingJacksonValue.setFilters(provider);
		
		return mappingJacksonValue;
	}
	
	
	// http://localhost:8585/filtering_list
	@GetMapping("/filtering_list")
	public MappingJacksonValue filtering_list()  {
 		List<JsonFilter> jf_list = Arrays.asList(new JsonFilter("Sankha", "S@123", "Kolkata"),
							 new JsonFilter("Akash", "A@123", "Chennai"),
							 new JsonFilter("Vijay", "V@123", "Bangalore"));
		
		MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(jf_list);

		SimpleBeanPropertyFilter filter = 
				SimpleBeanPropertyFilter.filterOutAllExcept("name","location");

		FilterProvider provider =
				new SimpleFilterProvider().addFilter("SomeBeanFilter", filter);
		
		mappingJacksonValue.setFilters(provider);
		
		return mappingJacksonValue;
	}
}
