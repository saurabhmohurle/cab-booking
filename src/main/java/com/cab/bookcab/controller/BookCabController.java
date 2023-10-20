package com.cab.bookcab.controller;

import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cab.bookcab.entity.BookCabEntity;
import com.cab.bookcab.service.BookCabService;

@RestController
public class BookCabController {
	private static final Logger logger = LoggerFactory.getLogger(BookCabController.class);
	
	@Autowired
	BookCabService service;
	
	String response;
	
	@PostMapping("BookCab")
	public String BookCab(@RequestBody BookCabEntity entity) {
		response = "Cab Booked Successfully.";
		logger.info(entity.toString());
		logger.info(response);
		return service.BookCab(entity);
	}
	@GetMapping("ShowDetailsById")
	public Optional<BookCabEntity> ShowDetailsById(@RequestParam int id){
		return service.ShowDetailsById(id);
	}
    public String CancelCabById(@RequestParam int id) {
		response = "Cab canceled successfully";
		logger.info(response);
		return service.CancelCabById(id);
	}
}
