package com.cj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cj.dto.MemberDTO;
import com.cj.service.MemberService;

@Controller
@RequestMapping("/member/*")
public class MemberController {
	
	//의존성 주입
	@Autowired
	MemberService memberService;
	
	//member/list.do -> MemberService -> MemberDAO -> MyBatis(memberMapper) -> DB 
	//localhost:8093/member/list.do
	@RequestMapping(value="list.do", method = RequestMethod.GET)
	public String memberList(Model model) throws Exception {
		List<MemberDTO> memberList = memberService.membetList();
		model.addAttribute("memberList", memberList);
		return "member/memberList";
	}
	
	
	//localhost:8093/member/getMember.do
	//@RequestMapping("getMember.do")
}
