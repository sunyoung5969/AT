package org.sun.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.sun.boardDTO.boardDTO;
import org.sun.boardVO.boardVO;
import org.sun.service.BoardService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@AllArgsConstructor
@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	private BoardService service;
	private HttpServletRequest request;
	
	@GetMapping("/test")
	public void detest(Model model) {
		
		model.addAttribute("test", service.getTotal());
		
	}
	
	@PostMapping("/search")
	public void test2(@ModelAttribute("boarDTO") boardDTO dto, Model model) {
		model.addAttribute("test", "search성공");

	}
	
	@RequestMapping("/save")
	@ResponseBody
	public void save(Model model, boardVO vo) {
	
		service.dbsave(vo);
		
		model.addAttribute("test", "저장 완료!");
		
	}
}
