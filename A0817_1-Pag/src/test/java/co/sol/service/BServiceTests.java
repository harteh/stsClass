package co.sol.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import co.sol.main.BVO;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BServiceTests {

	@Autowired
	private BService service;
	
	@Test
	public void aa() {
		log.info("-------------- aa() ");
		log.info(service);
		//출력 : co.sol.service.BServiceImpl@77bb0ab5
	}

	//전체목록 조회
	@Test
	public void testGetList(){
		log.info(service.getList());
	}

	//특정 게시글 조회
	@Test
	public void testget() {
		log.info(service.get(121));
	}

	//글 추가작업
	@Test
	public void testsubmit() {
		BVO bb = new BVO();
		
		bb.setTitle("spring");
		bb.setContent("spring content");
		bb.setWriter("new writer");

		log.info("-------------- testsubmit() ");
		log.info(service.submit(bb));
	}
	
	//글 수정
	/*
	@Test
	public void testup() {
		BVO bb = new BVO();
		bb.setBnum(81L);
		bb.setTitle("글 수정 ser");
		bb.setContent("글을 수정합니다.");
		bb.setWriter("mvc");

		log.info(service.modify(bb));
	}
	*/
	@Test
	public void testmodify() {
		BVO bb = service.get(21);
		
		if(bb == null) {
			return;
		}
		bb.setTitle("글 수정 boolean");
		bb.setContent("글을 수정합니다.boolean");
		bb.setWriter("boolean");

		log.info(service.modify(bb));
	}
	
	//글 삭제
	@Test
	public void testdel() {
		/* 게시글이 있는지 확인 후 삭제 처리
		BVO bb = service.get(22);
		if(bb == null) {
			return;
		} */
		
		log.info(service.del(22));
	}
	
}
