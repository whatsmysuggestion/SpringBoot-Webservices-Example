package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class SpingBootRestApplicationTests {

	@LocalServerPort
	private int port;
	
	@Autowired
	private TestRestTemplate restTemplate;
	
	@Test
	void contextLoads() throws Exception 
	{
		
		//assertEquals(this.restTemplate.postForObject("http://localhost:"+port+"/hello",null,String.class),"Hello Welcome");
		
		assertEquals(this.restTemplate.getForObject("http://localhost:"+port+"/hello/test",String.class),"Hello Welcome   test");
	}

}
