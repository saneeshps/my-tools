package com.automations.tools.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/my-tools")
public class WebController {

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping("/json_tools")
	public String jsonPage() {
		return "json_tools";
	}

}
