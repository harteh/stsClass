package co.bm.service;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import co.bm.domain.MemberVO;
import co.bm.service.MemService;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

//@RunWith(SpringRunner.class)
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
	public void getMemById() {
		MemberVO member = new MemberVO();
		log.info(service.getMemById(member));
	}
	

}
