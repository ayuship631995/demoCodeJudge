package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;


@RestController
public class demoController {

	Logger logger = LoggerFactory.getLogger(demoController.class);
	private static final ObjectMapper mapper = new ObjectMapper();

	
	
	@PostMapping("api/add")
	public ObjectNode getCities(@RequestBody JsonNode inputBody) {
		ObjectNode objNode = mapper.createObjectNode();

		int v1 = inputBody.get("number1").asInt();
		int v2 = inputBody.get("number2").asInt();
		objNode.put("sum", v1+v2);
		System.out.println(v1+v2);
		return objNode;

	}
//	
}
