package pu.fmi.internship;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AgregatorController {
	
	@Autowired
	private Agregator agregator;
	
	@RequestMapping(value="/agregate")
	public String agregate(@RequestParam int from, @RequestParam int to, ModelMap model) {
		model.addAttribute("result", agregator.agregateRange(from, to));
		return "ResultPage";
	}

}
