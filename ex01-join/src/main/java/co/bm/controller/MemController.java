package co.bm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	//회원 가입
	@PostMapping("/register")
	public String register(MemberVO member, RedirectAttributes rttr) {
		//가입 후 마이페이지(목록)화면으로 이동, 가입회원의 번호를 같이 전달한다
		Long user_id = service.registerMem(member);
		rttr.addFlashAttribute("result", user_id);
		
		return "redirect:/board/list";
	}
	
	//회원 1명 조회
	@GetMapping("/getMem")
	public void getMem(@RequestParam("user_id") Long user_id, Model model) {
		model.addAttribute("member", service.getMem(user_id));
	}

}
