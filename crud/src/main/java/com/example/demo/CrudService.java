package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CrudService {
	
	@Autowired
	CrudRepo repo;
	
	public List<CrudModel> getMovie(){
		return (List<CrudModel>) repo.findAll();
	}
	
	public void addMovie(CrudModel movie) {
		this.repo.save(movie);
	}
	
	public void deleteMovie(int id) {
		
		this.repo.deleteById(id);
	}

}
