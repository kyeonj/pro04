package com.cj.inject.test;

import javax.annotation.Resource;

public class TestBean8 {
	
	//필드명과 빈 이름(id)가 다른 경우 - name 속성 사용
	
	@Resource(name = "data1")
	private DataBean1 data100;

	@Resource(name = "data2")
	private DataBean2 data200;
}
