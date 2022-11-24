package com.cj.inject.test;

import javax.annotation.PreDestroy;

public class TestBean6 {
	
	//@PreDestroy : 체 소멸 전 자동으로 호출될 메소드에 붙여서 사용하는 애노테이션
	
	// 객체가 소멸되기 전에 자동으로 호출
	@PreDestroy
	public void destroy6() {
		System.out.println("TestBean6의 destroy 메서드");
	}
}
