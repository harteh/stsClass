package co.sol.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import co.sol.main.BVO;
import co.sol.service.BService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@RequiredArgsConstructor
@Log4j
@RequestMapping("/board/*")
public class BController {
	
	private final BService service;
	
	@GetMapping("/list")
	public void list(Model m) {
		
		log.info("목록 전체 가져오기");
		m.addAttribute("list", service.getList());
	}
	
	//폼 입력하는 부분
	@GetMapping("/submit")
	public void sub() { }
	
	
	/** 글 등록 이후 목록페이지로 넘어갈 때 
	 * 글 번호를 같이 가지고 간다	 -> ()번 글이 등록되었습니다.
	 */
	@PostMapping("/submit")
	public String submit(BVO bv, RedirectAttributes rt) {
		
		Long bnum = service.submit(bv);
		
		//글 번호 가져가기 위해서 RedirectAttributes 설정
		rt.addFlashAttribute("result", bnum);
		
		return "redirect:/board/list";
	}
	@GetMapping("/get")
	public void get(@RequestParam("bnum") int bnum, Model m) {
		m.addAttribute("board", service.get(bnum));
	}
	
	@PostMapping("/modify")
	public String modify(BVO bo, RedirectAttributes rt) {
		
		if(service.modify(bo)==1) {
			rt.addFlashAttribute("result", "성공");
		}
		return "redirect:/board/list";
	}
	
	@PostMapping("/del")
	public String del(@RequestParam("bnum")int bnum, RedirectAttributes rt) {
		if(service.del(bnum)==1) {
			rt.addFlashAttribute("result", "삭제 성공");
		}
		return "redirect:/board/list";
	}
	
	
	
	

}
