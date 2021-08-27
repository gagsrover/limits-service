package de.gags.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigController {
	
	@Autowired
	private LimitsPropConfig limitsPropConfig;
	
	@GetMapping("/limits")
	public LimitConfig getLimitConfig() {
		return new LimitConfig(limitsPropConfig.getMin(), limitsPropConfig.getMax());
	}
	
}
