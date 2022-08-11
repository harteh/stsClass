package co.sol.mapper;

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
public class BMapperTests {
	
	@Autowired
	private BMapper bm;
	
	@Test
	public void Btest() {
		log.info("board -----------");
		log.info(bm.getList());
	}

	@Test
	public void selOne() {
		log.info("board one -----------");
		/* log.info(bm.getBoardOne((long) 1)); */
		BVO bb = bm.getBoardOne(1);
		log.info(bb);
	}
	
	//	추가
	@Test
	public void inTest() {
		BVO bb = new BVO();
		bb.setTitle("추가 글3");
		bb.setContent("글등록 테스트3");
		bb.setWriter("강감찬");
		
		bm.insert(bb);
		
		log.info("insert -----------");
		System.out.println(bb.getBnum());
	}
	
	//selectKey
	@Test
	public void inkey() {
		BVO bb = new BVO();
		bb.setTitle("추가 24");
		bb.setContent("글등록 테스트24!!");
		bb.setWriter("정조23");
		
		bm.inkey(bb);
		
		log.info("selectKey -----------");
		System.out.println(bb.getBnum());
		
	}
	
	
	//수정
	@Test
	public void up() {
		BVO bb = new BVO();
		bb.setBnum(1L);
		bb.setTitle("수정글");
		bb.setContent("글을 수정 했습니다");
		bb.setWriter("세종대왕");
		
		log.info("board update -----------");
		log.info(bm.up(bb));
	}
	
//	삭제
	@Test
	public void delete() {
		log.info("board delete -----------");
		log.info(bm.del(61));
	}

}
