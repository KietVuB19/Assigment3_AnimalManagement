package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnimalServiceImp implements AnimalService{

	@Autowired
	private AnimalRepo animalRepo;
	@Override
	public List<Animal> getAllAnimal() {
		return animalRepo.findAll();
	}

	@Override
	public void saveAnimal(Animal animal) {
		this.animalRepo.save(animal);
	}

	@Override
	public void deleteAnimalbyId(Long id) {
		this.animalRepo.deleteById(id);
		
	}

	@Override
	public Animal getAnimalbyId(Long id) {
		Optional<Animal> optional = animalRepo.findById(id);
		Animal animal = null;
		if(optional.isPresent()) {
			animal = optional.get();
		}
		return animal;
	}

}
