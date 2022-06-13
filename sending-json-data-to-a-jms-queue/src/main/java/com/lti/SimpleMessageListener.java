package com.lti;

import org.springframework.stereotype.Component;

@Component
public class SimpleMessageListener {

	public String onMessage() {
		
		return "Published";
	}
	
}