package com.example.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Producer;

import com.example.repository.ProducerRepository;
import com.example.service.ProducerService;

@RestController
@RequestMapping
public class PrimaryController {

	@Autowired
	ProducerRepository producerRepository;
	
	@Autowired
	ProducerService producerService;
	
	@PostMapping("/AddFood")
	private String addFoodForProducer(@RequestBody Producer producer)
	{	
		producerRepository.save(producer);
		return "Food details added successfully";
	}
	
	@PostMapping("/FoodList")
	private String ListForProducer()
	{	
		return "Food details are :" + producerRepository.findAll();
	}
	
	@PostMapping("/DeleteFood/{id}")
	private String deleteFoodForProducer(@PathVariable Long id)
	{
		Optional<Producer> p1 = producerRepository.findById(id);
		producerRepository.deleteById(id);
		return "Food details deleted successfully : "+ p1;
	}
	
	@PostMapping("/BuyFood/{id}/{quantity}")
	private String BuyFood(@PathVariable Long id ,@PathVariable int quantity)
	{
		producerService.updateFoodQuantity(id,quantity);
		return "stock updated succesfully and email triggered";
	}
}
