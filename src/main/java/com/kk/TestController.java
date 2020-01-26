package com.kk;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@RestController
public class TestController {
	
	@Autowired
	private TestService service;

	@RequestMapping(method = RequestMethod.GET, path = "/greet", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<TestModel> greet() {
		return service.getTests();
	}
}
