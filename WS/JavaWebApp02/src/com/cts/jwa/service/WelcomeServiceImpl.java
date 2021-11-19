package com.cts.jwa.service;

import java.time.LocalDateTime;

public class WelcomeServiceImpl implements WelcomeService {

	@Override
	public String getWelcomeText() {
		String welcomeText="";
		
		int h = LocalDateTime.now().getHour();
		
		if(h>=3 && h<=12)	welcomeText="Good Morning";
		else if(h>12 && h<=16) welcomeText="Good Noon";
		else welcomeText="Good Evening";
		
		return welcomeText;
	}

}
