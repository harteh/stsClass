package co.bm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	
	//회원 전체 목록
	@GetMapping("/list")
	public void list(Model model) {
		log.info("Member list");
		model.addAttribute("list", service.getMemList());
	}

	//회원 가입 폼
	@GetMapping("/register")
	public String regForm(@ModelAttribute("member") MemberVO member) {
		return "/member/register";
	}
	
	//회원 가입 처리
	@PostMapping("/register")
	public String register(MemberVO member, RedirectAttributes rttr) {
		//가입 후 마이페이지(목록)화면으로 이동, 가입회원의 번호를 같이 전달한다
		Long user_id = service.registerMem(member);
		rttr.addFlashAttribute("result", user_id);
		
		return "redirect:/member/list";
	}
	
	//회원 1명 조회
	@GetMapping("/getMem")
	public void getMem(@RequestParam("user_id") Long user_id, Model model) {
		model.addAttribute("member", service.getMem(user_id));
	}
	
	
	// 메인: 로그인, 회원가입 버튼 모음 
	//임시 화면 -> 추후엔 버튼만 실제 메인화면에서 연결하면 되기 때문에 필요 없다
	//별도의 처리가 필요없이 페이지만 보여준다
	@GetMapping("/memMain")
	public void memMain() {}
	
	// 로그인 버튼 클릭 시 로그인 폼 화면으로 이동 시킨다.
	@RequestMapping("/login")
	public String loginForm() {
		return "/member/login";
	}
	
	// 로그인폼 화면에서, 로그인 버튼 클릭시 로그인 처리
	// 로그인 성공 시 memMain으로 이동시킨다
	@PostMapping("/loginProc")
	public String loingProc(MemberVO member, HttpServletRequest request) {
		log.info("LOGIN PROC ------ ");
		
		HttpSession session = request.getSession();
		
		return "";
	}
	

}
