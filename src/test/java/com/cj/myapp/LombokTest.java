package com.cj.myapp;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cj.dto.SampleDTO;
public class LombokTest {
	private static final Logger logger = LoggerFactory.getLogger(LombokTest.class);
	
	@Test
	public void testLombok() {
		SampleDTO dto = new SampleDTO();
		dto.setName("김기태");
		dto.setAge(38);
		dto.setIq(89.2);
	
		logger.info(dto.toString());
	}
}
