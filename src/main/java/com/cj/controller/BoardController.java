package com.cj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/board/*")
public class BoardController {

	@Autowired
	private BoardService boardService;
	
	@GetMapping("list.do")
	public String getBoardList(Model model) throws Exception {
	
		return "board/boardList";
	}
	
	@GetMapping("detail.do")
	public String getBoardDetail(@RequestParam("seq") int sec, Model model) throws Exception {
		return "board/boardDetail";
	}
}
