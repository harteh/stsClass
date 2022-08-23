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
		
		String user_id = service.loginChk(member);	//확인용
		log.info("loginProc user_id = " + user_id);
		
		MemberVO loginMem = service.getMemById(member);
		log.info("loginProc loginMem = " + loginMem);
		
		if(loginMem == null) {
			log.info("로그인 실패");
			return "/member/login";
		} else {
			// ================
			// 로그인 성공 하면 service에서 반환 받은 loginMem 을 세션에 담아서 메인 페이지로 이동한다
			session.setAttribute("mem", loginMem);
			return "redirect:/member/indexMem";
		}
	}
	
	//로그아웃 처리
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/member/indexMem";
	}
	
	//마이페이지 이동
	@GetMapping("/myPage")
	public String myPage(@ModelAttribute MemberVO member, HttpSession session) {
		log.info("myPage s = " + session);
		log.info("myPage s1 = " + session.getAttribute("mem"));
		
		return "/member/myPage";
	}
	
	//회원가입 폼으로 이동
	@GetMapping("/join")
	public void joinForm() {}

}
