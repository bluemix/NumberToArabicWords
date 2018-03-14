package com.company;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class NumbersRepresentationTest {

	@Test
	public void representHundreds() {

		Map<String, String> hundreds = new HashMap<>();

		hundreds.put("100", "مائة");
		hundreds.put("200", "مئتان");
		hundreds.put("300", "ثلاثمائة");
		hundreds.put("400", "أربعمائة");
		hundreds.put("500", "خمسمائة");
		hundreds.put("600", "ستمائة");
		hundreds.put("700", "سبعمائة");
		hundreds.put("800", "ثمانمائة");
		hundreds.put("900", "تسعمائة");

		validateNumbersMap(hundreds);
	}

	@Test
	public void representThousands() {
		Map<String, String> thousands = new HashMap<>();
		thousands.put("1000", "ألف");
		thousands.put("2000", "ألفان");
		thousands.put("3000", "ثلاثة آلاف");
		thousands.put("4000", "أربعة آلاف");
		thousands.put("5000", "خمسة آلاف");
		thousands.put("6000", "ستة آلاف");
		thousands.put("7000", "سبعة آلاف");
		thousands.put("8000", "ثمانية آلاف");
		thousands.put("9000", "تسعة آلاف");

		validateNumbersMap(thousands);
	}

	@Test
	public void representHundredThousands() {
		Map<String, String> hundredThousands = new HashMap<>();
		hundredThousands.put("100000", "مائة ألف");
		hundredThousands.put("200000", "مئتا ألف");
		hundredThousands.put("300000", "ثلاثمائة ألف");

		validateNumbersMap(hundredThousands);
	}

	@Test
	public void representHundredMillions() {
		Map<String, String> hundredThousands = new HashMap<>();
		hundredThousands.put("100000000", "مائة مليون");
		hundredThousands.put("200000000", "مئتا مليون");
		hundredThousands.put("300000000", "ثلاثمائة مليون");

		validateNumbersMap(hundredThousands);
	}

	private void validateNumbersMap(Map<String, String> numbersMap) {
		ArabicTools arabicTools = new ArabicTools();
		for (Map.Entry<String, String> entry : numbersMap.entrySet()) {
			String words = arabicTools.numberToArabicWords(entry.getKey());

			Assert.assertEquals(entry.getValue(), words);
		}
	}
}
