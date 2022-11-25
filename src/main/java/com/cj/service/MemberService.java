package com.cj.service;

import java.util.List;

import com.cj.dto.MemberDTO;

public interface MemberService {
	public List<MemberDTO> membetList() throws Exception;
	public MemberDTO getMember(String id) throws Exception;
}
