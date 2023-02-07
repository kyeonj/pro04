package com.cj.inject.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Setter;

@Component
public class TestBean2 {
		//@Autowired : 객체 타입을 통해 빈 객체를 자동으로 주입하는 애노테이션
	
		/*
		- 스프링프레임워크에서만 사용하는 애노테이션으로 다른 프레임워크에서는 활용할 수 없음
		- 객체 타입을 통해 빈 객체를 자동으로 주입한다.
		- 필드, 생성자, setter에 붙일 수 있다.
		- 필드, setter에 붙여서 사용할 경우 반드시 기본 생성자가 정의되어 있어야 한다.
		- 필드에 붙이면 setter를 통해 주입되며 setter가 없을 경우 컴파일 과정에서 자동으로 추가된다.
		*/	
	
		//data2와 같이 인스턴스명이 중복되는 경우 required=false 옵션을 지정하여 중복을 무시해야함
		// 자동으로 setter 메서드가 추가되어 setter 메서드를 통해 주입된다.

		//① 필드 자동 주입 - Class에 속한 Field 위에 @Autowired annotation을 붙여 주는 방식
		@Autowired
		private DataBean1 data1;	
	
		@Autowired(required=false)
		private DataBean2 data2;
		
		
		//② 수정자(Setter) 주입 : setter 메소드에 의한 주입
		private DataBean3 data3;
		@Autowired
		public void setDataBean3(DataBean3 data3) {
			this.data3 = data3;
		}
		
		
		//②-2 Lombok 설정자(Setter) 주입
		@Setter(onMethod_= {@Autowired})
		private DataBean4 data4;

		
		//③ 생성자(Constructor) 주입 : 해당 클래스인 TestBean2의 생성자를 이용하여 주입
		private DataBean5 data5;
		@Autowired
		public TestBean2(DataBean5 data5) {
			this.data5 = data5;
		}
		
		//③-2 Lombok을 사용한 생성자 주입(Constructor Injection) => TestBean10.java
}