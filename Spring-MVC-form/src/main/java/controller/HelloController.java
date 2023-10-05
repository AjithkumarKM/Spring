package controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

	@GetMapping("userform")
	public String showForm() {
		return "user-form";
	}	

	@RequestMapping(value = "showdata", method = RequestMethod.GET)
	public String showdata() {
		return "user-data";
	}
	
	@GetMapping("sayHello")
	public String sayHello() {
		return "sayHello";
	}
}