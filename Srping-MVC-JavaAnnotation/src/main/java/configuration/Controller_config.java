package configuration;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//controller configuration
@Controller
public class Controller_config {

	@GetMapping("sayHello")
	public String getHelloPage() {
		return "sayHello";
	}
}
