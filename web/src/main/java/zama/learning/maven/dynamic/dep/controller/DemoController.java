package zama.learning.maven.dynamic.dep.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import zama.learning.shared.service.SharedService;

@Controller
public class DemoController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome(ModelMap model) {
		model.addAttribute("message", SharedService.process());

		return "welcome";
	}

}
