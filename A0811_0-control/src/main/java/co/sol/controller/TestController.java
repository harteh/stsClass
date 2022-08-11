package co.sol.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import co.sol.main.TestDTO;
import lombok.extern.log4j.Log4j;

@Controller
//이 클래스가 컨트롤러 역할을 한다고 명시한다
//특정 uri로 요청을 보내면 Controller에서 어떤 방식으로 처리할지 정의한다
@RequestMapping("/test/*")
//이 요청을 특정 메서드와 매핑한다 -> 주로 value와 method를 사용한다
@Log4j		
//롬복. 로그 출력용
public class TestController {

	@RequestMapping("")
	public void aa() {
		log.info("hello!");
	}
	
	@RequestMapping(value="/aa", method= {RequestMethod.GET, RequestMethod.POST})
	//value = 요청받을 url을 설정
	//method는 어떤 요청으로 받을 지 정의
	public void bb() {
		log.info("hi~~");
	}
	
	//TestDTO 설정했음
	@GetMapping("/t1")
	public String t1(TestDTO tt) {
	//TestDTO를 파라미터로 사용하게 되면 자동으로 setter메소드가 동작하면서 파라미터를 수집하게 된다
		
		log.info("----------------");
		log.info(tt);
		//생성자가 호출된다
		
		return "t1";
	}

	@GetMapping("/t2")
	public String t2(@RequestParam("id") String aa, @RequestParam("age") int bb) {
		log.info("----------------");
		log.info(aa);
		log.info(bb);
		
		return "t2";
	}
	
	
	@GetMapping("/t3")
	public String t3(TestDTO tt, @ModelAttribute("pp") int pp) {
		//출력 -> ${testDTO }
		//int 기본타입은 그냥 출력이 안된다. ->  @ModelAttribute("pp") 추가로 모델에 담아서 출력해야한다
		log.info("----------------");
		log.info(tt);
		log.info(pp);
		
		return "test/t3";
	}
		
	
}


