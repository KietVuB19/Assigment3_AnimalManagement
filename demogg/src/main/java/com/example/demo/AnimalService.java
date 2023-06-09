package com.example.demo;

import java.util.List;

public interface AnimalService {
	List<Animal>getAllAnimal();
	void saveAnimal(Animal animal);
	void deleteAnimalbyId(Long id);
	Animal getAnimalbyId(Long id);
}
