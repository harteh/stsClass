package co.bm.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
	public String loginProc(@ModelAttribute MemberVO member, HttpSession session) {
		
		String user_id = service.loginChk(member);
		MemberVO loginMem = service.getMemById(member);
		
		log.info("loginProc user_id = " + user_id);
		log.info("loginProc loginMem = " + loginMem);
		
		if(loginMem == null) {
			log.info("로그인 실패");
			return "/member/login";
		} else {
			// ================
			// 로그인 성공
			session.setAttribute("mem", loginMem);
			session.setAttribute("user_id", loginMem.getUser_id());
			session.setAttribute("nickname", loginMem.getNickname());
			return "redirect:/member/indexMem";
		}
		
	}

}
