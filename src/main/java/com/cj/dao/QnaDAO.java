package com.cj.dao;

import java.util.List;

import com.cj.dto.QnaDTO;

public interface QnaDAO {
	public List<QnaDTO> qnaList() throws Exception;
	public QnaDTO qnaDetail(int no) throws Exception;
	
	
}
