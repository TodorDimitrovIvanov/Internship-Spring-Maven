package pu.fmi.internship;

import java.util.Calendar;

import org.springframework.stereotype.Component;

@Component
public class Greeting {
	
	public String message(String visitorName, int streamsNumber){
		Calendar today=Calendar.getInstance();
		return ("Hello, "+visitorName+" today is "+ today.getTime() + " and there are " + streamsNumber + " number of streams online!" );
	}
}
