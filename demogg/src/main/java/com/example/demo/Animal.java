package com.example.demo;

import jakarta.persistence.*;

@Entity
@Table(name = "animal")
public class Animal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "name")
	private String Name;
	@Column(name ="price")
	private String Price;
	@Column(name = "habitat")
	private String Habitat;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPrice() {
		return Price;
	}
	public void setPrice(String price) {
		Price = price;
	}
	public String getHabitat() {
		return Habitat;
	}
	public void setHabitat(String habitat) {
		Habitat = habitat;
	}
	
}
