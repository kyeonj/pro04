package com.cj.inject.test;

import javax.annotation.PostConstruct;

public class TestBean5 {
	
	//@PostConstruct : 생성자 호출 후 자동으로 호출될 메소드에 붙여서 사용하는 애노테이션
	
	// 생성자 호출 이후 자동으로 호출
	@PostConstruct
	public void init5() {
		System.out.println("TestBean5의 init 메서드");
	}
}
