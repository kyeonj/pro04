package com.cj.dto;

import lombok.Data;

@Data
public class BoardDTO {
	private int seq;
	private String title;
	private String content;
	private String ninkname;
	private String regdate;
	private int visited;
}
