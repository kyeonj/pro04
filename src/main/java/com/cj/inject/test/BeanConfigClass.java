package com.cj.inject.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfigClass {
	/* context에서 설정하지 않고, @Configuration 애노테이션을 활용하면, Bean의 선언이 가능함 */
	@Bean
	public TestBean1 testBean1() {
		return new TestBean1();
	}
	
	/*
	context(servlet-context)에서 설정시에는 아래와 같이 등록함
	<bean id='testBean1' class="com.cj.inject.test.TestBean1"/>
	*/
	
	@Bean
	public TestBean2 testBean2() {
		return new TestBean2(null);
	}
	
	@Bean
	public TestBean3 testBean3() {
		return new TestBean3();
	}
	
	@Bean
	public TestBean5 obj5() {
		return new TestBean5();
	}
	
	@Bean
	public TestBean6 obj6() {
		return new TestBean6();
	}
	
	@Bean
	public TestBean7 obj7() {
		return new TestBean7();
	}
	
	@Bean
	public TestBean8 obj8() {
		return new TestBean8();
	}
	
	@Bean
	public DataBean1 dataBean1() {
		return new DataBean1();
	}
	
	@Bean
	public DataBean1 data1() {
		return new DataBean1();
	}
	
	@Bean
	public DataBean2 data2() {
		return new DataBean2();
	}
	
	@Bean
	public DataBean2 dataBean2() {
		return new DataBean2();
	}
		
	@Bean
	public DataBean3 obj3() {
		return new DataBean3();
	}
	
	@Bean
	public DataBean4 obj4() {
		return new DataBean4();
	}
	
	@Bean
	public DataBean3 data3() {
		return new DataBean3();
	}
	
	@Bean
	public DataBean4 data4() {
		return new DataBean4();
	}
}