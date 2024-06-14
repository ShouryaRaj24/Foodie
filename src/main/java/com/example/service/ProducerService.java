package com.example.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Producer;
import com.example.repository.ProducerRepository;

@Service
public class ProducerService {

	@Autowired
	ProducerRepository producerRepository;

	public void updateFoodQuantity(Long id, int quantityUsed) {
		Optional<Producer> p1 = producerRepository.findById(id);
		int newQuantity = p1.get().getQuantity() - quantityUsed;
		if (newQuantity >= 0) {
			p1.get().setQuantity(newQuantity);
			producerRepository.save(p1.get());
		} else {
			throw new IllegalArgumentException("Quantity used exceeds available quantity");
		}

	}
}
