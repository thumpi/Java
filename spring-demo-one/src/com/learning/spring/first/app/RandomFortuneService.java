package com.learning.spring.first.app;

import java.util.*;

public class RandomFortuneService implements FortuneService {
	
	ArrayList<String> list;
	RandomFortuneService()
	{
		list = new ArrayList<String>();
		list.add("today is your best day");
		list.add("be careful today");
		list.add("today you make glory");
		list.add("today, you are awesome.");
	}

	@Override
	public String getFortune() {
		
		if(list.isEmpty())
		{
			return "This is the default future message";
		}

		// create a random index
		Random rand = new Random(); 
        int randIdx = rand.nextInt(list.size());
		return list.get(randIdx);
	}

}
