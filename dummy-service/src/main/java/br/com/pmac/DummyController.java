package br.com.pmac;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("dummy-service")
public class DummyController {
	
	@GetMapping("/hi")
	public String dummyController() {
		return "Hello!";
	}

}
