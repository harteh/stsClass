package co.bm.dao;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import co.bm.domain.MemberVO;
import co.bm.mapper.MemMapper;
import co.bm.service.MemService;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class MemDAOTests {
	
	@Setter(onMethod_= {@Autowired })
	private MemMapper dao;
	
	@Test
	public void testGetMemById() {
		MemberVO member = dao.getMemById(2L);
		log.info(member);
	}

}
