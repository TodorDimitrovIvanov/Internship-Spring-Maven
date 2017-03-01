package pu.fmi.internship;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetingController {

	@Autowired
	private Greeting greetingObject;
	
	@RequestMapping("/")
	public String greet(String visitorName, Integer streamsNumber, ModelMap model){
		visitorName="visitor";
		streamsNumber=11;
		//Assertions.assertThat(visitorName).isNotEmpty();
		model.addAttribute("answer",greetingObject.message(visitorName, streamsNumber));
		return "GreetingsPage";
	}
	
	
}
 