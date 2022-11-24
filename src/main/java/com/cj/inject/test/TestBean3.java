package com.cj.inject.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class TestBean3 {
	
	//@Qualifier : @Autowired 로 주입되는 객체를 못 찾을 시에 강제로 주입할 객체를 지정하는 애노테이션 
	
	/*
	- @Autowired와 함께 사용한다.
	- @Autowired를 통한 자동 주입 시 같은 타입의 빈이 여러 개 정의되어 있으면 @Qualifier에 설정되어 있는 빈을 찾아 주입한다.
	*/
	
	//@Autowired와 @Qualifier 활용
	@Autowired(required=false)
	@Qualifier("obj3")
	private DataBean3 data3;
	
	@Autowired(required=false)
	@Qualifier("obj4")
	private DataBean4 data4;
}
