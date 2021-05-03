package com.mightyjava.restcontroller;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoMappingFoundController implements ErrorController {

	private static final String PATH = "/error";

	@Override
	public String getErrorPath() {
		return PATH;
	}

	@RequestMapping(PATH)
	public String error() {
		return "No Resource Mapping available.";
	}
}
