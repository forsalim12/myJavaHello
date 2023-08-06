package com.example.demoHello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "/test")
@RestController
public class SampleController {

	@GetMapping(path="/hello")
	@ResponseBody
	public String hello(){
		return "Welcome to the Docker World, changed...";
	}
}
