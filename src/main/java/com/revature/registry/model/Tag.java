package com.revature.registry.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Tag {
	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	private String description;

}
