package com.example.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

	private static final String template = "Hello, %s";
	private static final AtomicLong counter = new AtomicLong();

	
	@RequestMapping(method = {RequestMethod.GET,RequestMethod.POST})
	@ResponseStatus(value = HttpStatus.OK)
	public Greeting greeting(@RequestParam(value = "name") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
}