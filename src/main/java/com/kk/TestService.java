package com.kk;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

	@Autowired
	private TestRepository repo;
	
	public List<TestModel> getTests(){
		return repo.findAll();
	}
	
}
