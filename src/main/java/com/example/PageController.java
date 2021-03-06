package com.example;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class PageController {
	@RequestMapping("/hello")
	public String index() {
	
		return "hello";
	}	
	@RequestMapping("/k")
	public String x() {
		return "hello";
	}

	@RequestMapping("/greeting")
	public String greeting(@RequestParam(value = "name", required = false, defaultValue = "dunia") String name,
			Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}

	@RequestMapping("/greeting/{name}")
	public String greetingPath(@PathVariable String name, Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}
	
	@RequestMapping("/perkalian")
	public String jumlah(@RequestParam(value = "a", required = false, defaultValue = "0") int a,
			@RequestParam(value = "b", required = false, defaultValue = "0") int b, Model model) {
		model.addAttribute("x", a);
		model.addAttribute("y", b);
		return "jumlah";
	}
}
