package com.cj.myapp;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cj.dto.MemberDTO;

public class DTOtest {
	private static final Logger Logger = LoggerFactory.getLogger(DTOtest.class);
	
	@Test
	public void testLombok() {
		MemberDTO dto = new MemberDTO();
		dto.setId("kkt");
		dto.setPw("1234");
		dto.setName("김기태");
		dto.setTel("01020482048");
		dto.setAddr("화정동");
		dto.setPt(100);
		dto.setRegdate("2022-11-21");
		
		Logger.info(dto.toString());
	}

}
