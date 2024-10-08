package com.udea.consulta;

import com.fasterxml.jackson.databind.JsonNode;
import com.udea.consulta.controller.DataController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("ALL")
@SpringBootTest
class ConsultaApplicationTests {
	@Autowired
	DataController dataController;
	@Test
	void health() {
		assertEquals("HEALTH CHECK OK!", dataController.healthCheck());
	}
	@Test
	void version() {
		assertEquals("The actual version is 1.0.0", dataController.version());
	}
	@Test
	void nationLength() {
		Integer nationsLength = dataController.getRandomNations().size();
		assertEquals(10, nationsLength);
	}
	@Test
	void currenciesLength() {
		Integer currenciesLength =
				dataController.getRandomCurrencies().size();
		assertEquals(20, currenciesLength);
	}
	@Test
	public void testRandomCurrenciesCodeFormat() {
		DataController controller = new DataController();
		JsonNode response = controller.getRandomCurrencies();
		for (int i = 0; i < response.size(); i++) {
			JsonNode currency = response.get(i);
			String code = currency.get("code").asText();
			assertTrue(code.matches("[A-Z]{3}")); // Check for 3 uppercaseletters format
		}
	}
	@Test
	public void testRandomNationsPerformance() {
		DataController controller = new DataController();
		long startTime = System.currentTimeMillis();
		controller.getRandomNations();
		long endTime = System.currentTimeMillis();
		long executionTime = endTime - startTime;
		System.out.println(executionTime);// Assert that execution time is within acceptable limits
		assertTrue(executionTime < 2000); // 2 second threshold
	}
	@Test
	void aviationsLength() {
		Integer aviationsLength = dataController.getRandomnAviation().size();
		assertEquals(20, aviationsLength);
	}
}