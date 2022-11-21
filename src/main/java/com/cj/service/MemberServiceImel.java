package com.cj.service;

import java.awt.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cj.dto.MemberDTO;

public class MemberServiceImel implements MemberService{
	
	@Autowired
	MemberDAO memberDao;
	
	@Override
	public List<MemberDTO> memberList() throws Exception {
		return memberDao.memberList();
	}
	
	@Override
	public MemberDTO getMember(String id) throws Exception {
		return member
	}

}
