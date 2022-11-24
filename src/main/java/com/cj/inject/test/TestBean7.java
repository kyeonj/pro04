package com.cj.inject.test;

import javax.annotation.Resource;

public class TestBean7 {
	
	//@Resource : 해당 인스턴스명(id)로 자동 주입하는 애노테이션으로 자바에서 제공한다.
	
	/*
	- 자바에서 제공하므로 스프링프레임워크가 아닌 곳에서도 활용할 수 있다.
	- 필드, 파라미터가 1개인 setter에 붙일 수 있다.
	- 빈 이름(id)을 통해 자동 주입
	- @Autowired + @Qualifier와 유사
	- 필드명과 동일한 이름의 빈을 주입
	- 필드명과 빈 이름이 다르면 @Resource(name="…") 에 지정한 name으로 주입한다.
	*/
	
	// 변수의 이름과 동일한 이름의 Bean이 주입된다.
	@Resource
	private DataBean1 data1;
	
	@Resource
	private DataBean2 data2;
}
