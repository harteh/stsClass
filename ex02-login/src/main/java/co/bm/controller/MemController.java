package co.bm.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co.bm.domain.MemberVO;
import co.bm.service.MemService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/member/*")
@AllArgsConstructor
public class MemController {
	
	private MemService service;
	
	//임시메인용
	@GetMapping("/indexMem")
	public String indexMem() {
		return "/member/indexMem";
	}
	
	//로그인 폼으로 이동
	@GetMapping("/login")
	public String loginForm() {
		return "/member/login";
	}
	
	//로그인 처리
	@PostMapping("/loginProc")
	public String loginProc(@RequestParam("user_id") Long user_id, 
			Model model, HttpSession session) {
		
		MemberVO member = service.getMemById(user_id);
		log.info("loginProc---" + user_id);
		
		if(member == null) {
			model.addAttribute("message", "id나 비번이 틀립니다");
			return "login";
		} else {
			// ================
			// 로그인 성공
			session.setAttribute("member", member);
			session.setAttribute("user_id", member.getUser_id());
			session.setAttribute("nickname", member.getNickname());
			return "redirect:/member/indexMem";
		}
		
	}

}
