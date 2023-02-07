package com.cj.dto;

import lombok.Data;

@Data
public class QnaDTO {
	private int no;
	private String title;
	private String content;
	private String regdate;
	private int visited;
	private String id;
	private int lev;
	private int parno;
	private String sec;
}
