package co.bm.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import co.bm.domain.MemberVO;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class MemMapperTests {
	
	@Autowired
	private MemMapper mapper;
	
	@Test
	public void testGetMemList() {
		mapper.getMemList().forEach(mamber -> log.info(mamber));
	}
	
	@Test 
	public void testGetMem() {
		MemberVO mvo = mapper.getMem(3L);
		log.info(mvo);
	}
	
	@Test
	public void testJoinMem() {
		MemberVO mvo = new MemberVO();
		mvo.setUser_id(1L);
		mvo.setEmail("testUser1@naver.com");
		mvo.setNickname("테스트유저1");
		mvo.setPassword("1111");
		mvo.setUser_name("test1");
		mvo.setPhone("010-0001-0001");
		mvo.setAddr("서울시 중구 1111");
		mvo.setUser_grade(1L);
		
		mapper.joinMem(mvo);
	}
	
}
