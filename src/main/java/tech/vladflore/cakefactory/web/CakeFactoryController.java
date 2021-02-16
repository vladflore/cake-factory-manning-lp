package tech.vladflore.cakefactory.web;

import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/")
public class CakeFactoryController {
	@GetMapping
	public String showLandingPage(Model model) {
		model.addAttribute("appTitle", "Cake Factory");
		return "index";
	}
}
