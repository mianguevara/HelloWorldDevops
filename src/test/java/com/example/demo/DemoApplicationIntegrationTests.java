package com.example.demo;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest
@AutoConfigureMockMvc
public class DemoApplicationIntegrationTests {
 
    private static final String URL = "/greeting";

    @Autowired
	private MockMvc mvc;
    
    @Test
    public void shouldReturnHttpCode200OnGet() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get(URL+"?name=Michell")).andExpect(status().isOk());
    }

    @Test
    public void shouldReturnHttpCode200OnPost() throws Exception {
        mvc.perform(MockMvcRequestBuilders.post(URL).param("name", "Michell")).andExpect(status().isOk());
    }

    @Test
    public void shouldReturnHttpCode405OnPUT() throws Exception {
        mvc.perform(MockMvcRequestBuilders.put(URL)).andExpect(status().isMethodNotAllowed());
    }

    @Test
    public void shouldReturnHttpCode400OnGetWithoutParameter() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get(URL)).andExpect(status().isBadRequest());
    }
    
    @Test
    public void shouldReturnHttpCode400OnPostWithoutParameter() throws Exception {
        mvc.perform(MockMvcRequestBuilders.post(URL)).andExpect(status().isBadRequest());
  }
}
