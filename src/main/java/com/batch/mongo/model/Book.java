package com.batch.mongo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection="Book")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
	@Id
	private int id;
	@Indexed(unique=true)
	private String name;
	private String unit;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	private Book(int id, String name, String unit) {
		super();
		this.id = id;
		this.name = name;
		this.unit = unit;
	}
	private Book() {
		super();
	}
	

}
