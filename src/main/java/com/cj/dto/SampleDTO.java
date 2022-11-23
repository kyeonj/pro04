package com.cj.dto;

import lombok.Data;

@Data	//가상으로 게터,세터,투스트링이생성됨. 개별도 가능함. @Setter/@Getter/
public class SampleDTO {
	private String name;
	private int age;
	private double iq;
}
