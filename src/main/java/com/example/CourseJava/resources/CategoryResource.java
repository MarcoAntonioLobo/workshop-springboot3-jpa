package com.example.CourseJava.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CourseJava.entities.Category;
import com.example.CourseJava.services.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

	@Autowired
	private CategoryService service;

	@GetMapping
	public ResponseEntity<List<Category>> findAll() {
		List<Category> list = service.findAll();
		return ResponseEntity.ok().body(list);

	}

	@GetMapping(value = "/{Id}")
	public ResponseEntity<Category> findById(@PathVariable Long Id) {
		Category obj = service.findById(Id);
		return ResponseEntity.ok().body(obj);

	}
}
