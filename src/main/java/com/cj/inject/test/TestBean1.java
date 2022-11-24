package com.cj.inject.test;

import org.springframework.beans.factory.annotation.Required;

public class TestBean1 {
	private int data1;
	
	public int getData1() {
		return data1;
	}
	
	//@Required : 설정자(setter)에 붙여 반드시 주입해야하는 프로퍼티로 설정하는 애노테이션
	/*
	- setter에 붙여 반드시 주입해야하는 프로퍼티로 설정하는 애노테이션
	- Spring 5.1 버전 부터 Deprecated 되었다. ➡️ 반드시 주입해야 할 프로퍼티는 생성자 주입을 이용한다.
	- 스프링 5.1이상을 사용하거나 자바 파일로 bean을 등록했을 경우 무시된다. */
	@Required
	public void setData1(int data1) {
		this.data1 = data1;
	}
}