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
	public void tt() {
		log.info(bm.getList());
	}
	
	@Test
	public void aa() {
		BVO bb=new BVO();
		bb.setTitle("안녕");
		bb.setContent("내용");
		bb.setWriter("길동");
		
		bm.insert(bb);
	}
	
	@Test
	public void ee() {
		BVO bb=new BVO();
		
		bb.setTitle("inkey");
		bb.setContent("in");
		bb.setWriter("insung");
		
		bm.inkey(bb);
		System.out.println(bb.getBnum());
	}

	@Test
	public void bb() {
		BVO bb=bm.sel(2);
		log.info(bb);
	}
	
	@Test
	public void cc() {
		log.info(bm.del(102));
	}
	
	@Test
	public void dd() {
		BVO bb=new BVO();
		bb.setBnum(1L);
		bb.setTitle("up");
		bb.setContent("up");
		bb.setWriter("jj");
		
		bm.up(bb);		
		
	}

}









