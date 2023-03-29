package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CrudController {
	
	@Autowired
	CrudService serv;
	
	@GetMapping("/movie")
	public List<CrudModel> getMovie(){
		return serv.getMovie();
	}
	
	@PostMapping("/movie/add")
	public ResponseEntity<?> addMovie(@RequestBody CrudModel movie){
		serv.addMovie(movie);
		return new ResponseEntity<CrudModel>(movie,HttpStatus.OK);
	}
	
	@DeleteMapping("/movie/delete/{id}")
	public ResponseEntity<?> deleteMovie(@PathVariable int id) {
		serv.deleteMovie(id);
		return new ResponseEntity<>(id,HttpStatus.OK);
	}
}
