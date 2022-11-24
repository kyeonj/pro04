package com.cj.inject.test;

import javax.inject.Inject;
import javax.inject.Named;

public class TestBean9 {
	//@Inject : 필드, 생성자, setter의 자동 주입이 가능한 애노테이션으로 자바에서 제공한다.
	
	/*
	- 자바에서 제공하므로 스프링프레임워크가 아닌 곳에서도 활용할 수 있다.
	- 필드, 생성자, setter에 붙일 수 있다.
	- 빈 타입으로 통해 자동 주입이 되며, 같은 타입이 없는 경우 해당 id로 찾게 되며, 일치하는 것이 없을 시에 예외를 발생시킴
	- 필드명과 빈 이름이 다르면 @Named("id") 를 지정
	 */

	@Inject
	private DataBean4 data400;
	
	@Inject
	@Named("data5")
	private DataBean4 data500;
}
