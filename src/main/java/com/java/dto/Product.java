package com.java.dto;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.java.dto.Comment;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@Document
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	@JsonIgnore
	@Id
	private String id;
	private String name;
	private String colortype = "default color/type";
	private String model = "default model";
	private String brand = "no brand info";
	private String url;
	private float price =100f;
	private String description = "no description.";
	private ArrayList<Comment> comments;
	/*@JsonSerialize(using=CategorySerializer.class)
	@JsonDeserialize(using=CategoryDeserializer.class)*/
	private ArrayList<String> categories;
	
	
}