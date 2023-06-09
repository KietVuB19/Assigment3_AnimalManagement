package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AnimalController {
	@Autowired
	private AnimalService animalService;
	
	@GetMapping("/")
	public String viewAll(Model model) {
		model.addAttribute("listAnimal", animalService.getAllAnimal());
		return "homePage";
	}
	
	@GetMapping("/saveAnimal")
	public String saveAnimal(Model model) {
		Animal animal = new Animal();
		model.addAttribute("animal", animal);
		return "addAnimal";
		
	}
	
	@PostMapping("/addAnimal")
	public String addAnimal(@ModelAttribute("animal") Animal animal) {
		animalService.saveAnimal(animal);
		return"redirect:/";
	}
	
	@GetMapping("/deleteAnimal/{id}")
	public String deleteAnimal(@PathVariable(value = "id") Long id) {
		animalService.deleteAnimalbyId(id);
		return"redirect:/";
	}
	
	@GetMapping("/updateAnimal/{id}")
	public String updateAnimal(@PathVariable(value = "id") Long id, Model model) {
		Animal animal = animalService.getAnimalbyId(id);
		
		model.addAttribute("animal", animal);
		return"updateAnimal";
	}
}
