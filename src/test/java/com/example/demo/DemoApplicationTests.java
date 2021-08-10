package com.example.demo;

import static org.assertj.core.api.Assertions.byLessThan;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
	private final static String NAME = "Michell";
	private final GreetingController greetingController = new GreetingController();
	
	@Test
    void shouldReturnInputString() {
    	final Greeting greetingResponse = greetingController.greeting(NAME);
    	assertEquals(greetingResponse.getContent(),("Hello, "+NAME));
    }

	@Test
    void idShouldGreaterThanZero() {
		final Greeting greetingResponse = greetingController.greeting(NAME);
        assertThat((int)(greetingResponse.getId()), greaterThan(0));
    }


}
