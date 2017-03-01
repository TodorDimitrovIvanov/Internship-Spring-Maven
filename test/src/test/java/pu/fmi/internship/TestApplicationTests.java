package pu.fmi.internship;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestApplicationTests {
	
	@Autowired
	private Agregator agregator;

	@Test
	public void testAgregator() {
		int sum = agregator.agregateRange(1, 3);
		Assertions.assertThat(sum).isEqualTo(6);
	}

}
