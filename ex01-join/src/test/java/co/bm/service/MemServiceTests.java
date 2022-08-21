package co.bm.service;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import co.bm.domain.MemberVO;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class MemServiceTests {
	
	@Setter(onMethod_= {@Autowired })
	private MemService service;
	
	@Test
	public void testExist() {
		// MemService 객체가 생성되고 MemMapper가 주입되었는지 확인
		log.info(service);
		assertNotNull(service);
	}
	
	@Test
	public void testGetMemList() {
		log.info(service.getMemList());
	}
	
	@Test
	public void testRegisterMem() {
		
		MemberVO member = new MemberVO();
		member.setUser_id(1L);
		member.setEmail("testUser2@naver.com");
		member.setNickname("테스트유저2");
		member.setPassword("1111");
		member.setUser_name("test2");
		member.setPhone("010-0002-0002");
		member.setAddr("서울시 중구 2222");
		member.setUser_grade(1L);
		
		service.registerMem(member);
		log.info("가입한 회원의 번호: " + member.getUser_id());
	}
	

}
