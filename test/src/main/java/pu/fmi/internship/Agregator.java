package pu.fmi.internship;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Agregator {
	
	@Autowired
	private Calculator calculator;
	
	public int agregateRange(int from, int to) {
		int sum = 0;
		for (int i = from; i <= to; i++) {
			sum = calculator.sum(sum, i);
		}
		return sum;
	}
}
