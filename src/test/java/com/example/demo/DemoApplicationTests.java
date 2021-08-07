package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
	private final static String NAME = "Michell";
	private final GreetingController greetingController = new GreetingController();
	
	@Test
    public void shouldReturnInputString() {
    	final Greeting greetingResponse = greetingController.greeting(NAME);
    	assertEquals(greetingResponse.getContent(),("Hello, "+NAME));
    }

	@Test
    public void idShouldGreaterThanZero() {
		final Greeting greetingResponse = greetingController.greeting(NAME);
        if(greetingResponse.getId() > 1 == true);
    }


	@Test
	void contextLoads() {
	}


}
