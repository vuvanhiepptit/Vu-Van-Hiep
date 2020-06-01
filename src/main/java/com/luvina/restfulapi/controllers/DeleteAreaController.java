package com.luvina.restfulapi.controllers;

import com.luvina.restfulapi.repositories.TblAreaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("post_offices")
public class DeleteAreaController {
	
	@Autowired
	private TblAreaRepository areaRepository;
	
	@RequestMapping(value = "delete/area/{area_id}", method = RequestMethod.GET)
	public void deleteAreaById(@PathVariable(value = "area_id") int area_id) {
        areaRepository.deleteArea(area_id);
	}

}
