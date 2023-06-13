package br.com.java14Features;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SwitchExpressionsTests {

/* 
	Switch Expressions
 */

		private static final String FINAL_DE_SEMANA = "Final de semana";
		private static final String DIA_UTIL = "Dia util";

		private enum DIA_SEMANA { SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO };

	@Test
	void switchExpressions_retornaDiaUtil_quandoSucesso() {
		String resultado = 
		switch (DIA_SEMANA.SEGUNDA) {
			case SEGUNDA:
			case TERCA:
			case QUARTA:
			case QUINTA:
			case SEXTA:
				yield resultado = DIA_UTIL;
			case SABADO:
			case DOMINGO: yield resultado = FINAL_DE_SEMANA;
		};
		assertEquals(String.valueOf(DIA_UTIL), resultado);
	}

	@Test
	void switchExpressions_retornaFinalDeSemana_quandoSucesso() {
		var resultado = 
		switch (DIA_SEMANA.SABADO) {
			case SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA -> DIA_UTIL;
			case SABADO, DOMINGO -> FINAL_DE_SEMANA;
		};
		assertEquals(String.valueOf(FINAL_DE_SEMANA), resultado);
	}

}
