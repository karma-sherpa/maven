package bt.gov.springboot.maven.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MavenController {
	@GetMapping({"/index"})
	public String index(@RequestParam(value="name",defaultValue="hi", required=true) String name, Model model) {
		model.addAttribute("name",name);
		return "index";
	}
}
