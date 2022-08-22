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
	public String loginProc( MemberVO member, HttpSession session) {
		/*  @RequestParam("user_id") Long user_id,  @RequestParam("password") String password, */
		
		MemberVO mem = service.getMemById(member);
		log.info("loginProc = " + mem);
		
		if(mem == null) {
			log.info("로그인 실패");
			return "/member/login";
		} else {
			// ================
			// 로그인 성공
			session.setAttribute("mem", mem);
			session.setAttribute("user_id", mem.getUser_id());
			session.setAttribute("nickname", mem.getNickname());
			return "redirect:/member/indexMem";
		}
		
	}

}
