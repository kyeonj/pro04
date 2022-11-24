package com.cj.inject.test;

import org.springframework.beans.factory.annotation.Value;

public class TestBean4 {
	private int data1;
	private String data2;
	private DataBean4 data4;
	private DataBean5 data5;

	//@Value : 생성자 주입 시 자동으로 주입되지 않는 기본 자료형과 문자열의 값을 설정하는 애노테이션
	
	//@Value 활용 
	public TestBean4(@Value("100") int data1, @Value("문자열") String data2, DataBean4 data4, DataBean5 data5) {
		this.data1 = data1;
		this.data2 = data2;
		this.data4 = data4;
		this.data5 = data5;
	}
}
