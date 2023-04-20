package com.BikkadIT.SpringMVCSecondApp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GoodMorningController {
	
	@GetMapping("/gmMessage")
	public String goodMorningMsg(Model model) {
		
		String gmMSG="Good Morning All";
		
		model.addAttribute("MSG", gmMSG);
		
		return "morning";
		
	}

}
