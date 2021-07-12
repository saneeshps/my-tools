package com.automations.tools.controller;

import org.json.JSONObject;
import org.json.XML;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

@RestController
@RequestMapping("/my-tools")
public class JSONController {

	@PostMapping(value = "/format-json", produces = MediaType.APPLICATION_JSON_VALUE)
	public String formatJsonContent(String payload) {
		System.out.println("inputJson" + payload);
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		JsonElement jsonElem = JsonParser.parseString(payload);
		String output = gson.toJson(jsonElem);
		return output;
	}

	@PostMapping(value = "/json-to-xml", produces = MediaType.APPLICATION_XML_VALUE)
	@ResponseBody
	public String jsonToXML(String payload) {
		System.out.println("jsonToXML : " + payload);
		JSONObject json = new JSONObject(payload);
		String xml = XML.toString(json);
		System.out.println("jsonToXML : " + xml);
		return xml;
	}

}
