package ex.output.contentsapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	public String helloworld = "Hello World!";

	@RequestMapping("/")
	public String init () {
		return helloworld;
	}

}
