package ma.cigma.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping(value = { "/hello2", "/" })
	public String hello() {
		return "Hello World";
	}
}
