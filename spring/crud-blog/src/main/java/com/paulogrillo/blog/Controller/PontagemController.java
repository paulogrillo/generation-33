package com.paulogrillo.blog.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paulogrillo.blog.Repository.PostagemRepository;
import com.paulogrillo.blog.model.Postagens;

@RestController
@RequestMapping("/postagens")
@CrossOrigin("*")
public class PontagemController {
	
	@Autowired
	private PostagemRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Postagens>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	
}
