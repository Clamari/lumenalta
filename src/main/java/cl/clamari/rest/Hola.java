package cl.clamari.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hola")
public interface Hola {

	@GetMapping("/get")
	public String get();
}
