package com.cab.bookcab.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cab.bookcab.entity.BookCabEntity;
import com.cab.bookcab.entity.BookCabRepository;

@Service
public class BookCabService {

	private static final Logger logger = LoggerFactory.getLogger(BookCabService.class);
	
	String response;
	@Autowired
	BookCabRepository repository;
	
	public String BookCab(BookCabEntity entity) {
		// TODO Auto-generated method stub
		repository.save(entity);
		response = "Cab Booked Successfully.";
		logger.info(entity.toString());
		logger.info(response);
		return response;
	}

	public Optional<BookCabEntity> ShowDetailsById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	public String CancelCabById(int id) {
		// TODO Auto-generated method stub
		try {
			repository.deleteById(id);
			response = "Ride canceled successfully";
			logger.info(response);
		} catch (Exception e) {
			// TODO: handle exception
			response = "Invalid Id";
			logger.error(response);
		}
		
		return response;
	}
	
	

}
