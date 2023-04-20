package com.BikkadIT.SpringMVCSecondApp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GoodEveningController {
	
	@GetMapping("/gEveMessage")
	public String goodEveMessage(Model model) {
		
		String goodEveMsg="Good Evening All";
		
		model.addAttribute("MSG", goodEveMsg);
		
		return "evening";
		
	}
	
}
