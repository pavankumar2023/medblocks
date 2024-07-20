package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MedblocksController {
	
	@RequestMapping(path="/init",method = RequestMethod.GET)
	public String init() {
		return "HAPI-FHR-Integration-POC";
	}

}
