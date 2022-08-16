package co.sol.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/root-context.xml", 
		"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"})
@Log4j
@WebAppConfiguration
public class BControllerTests {

	@Setter(onMethod_={@Autowired})
	private WebApplicationContext ctx;
	
	private MockMvc mc;		//가짜mvc
	
	@Before
	public void setup() {
		this.mc = MockMvcBuilders.webAppContextSetup(ctx).build();
	}
	
	@Test
	public void testList() throws Exception {
		log.info(mc.perform(MockMvcRequestBuilders.get("/board/list"))
				.andReturn().getModelAndView().getModelMap());
	}
	
	@Test
	public void testSubmit() throws Exception {
		log.info(mc.perform(MockMvcRequestBuilders.post("/board/submit")
				.param("title", "New test")
				.param("content", "새로운 test 입니다. ")
				.param("writer", "NoJam")).andReturn());
	}
	
	@Test
	public void testModi() throws Exception {
		log.info(mc.perform(
				MockMvcRequestBuilders.post("/board/modify")
				.param("bnum", "161")
				.param("title", " modify 해보자")
				.param("content", "modify 내용")
				.param("writer", "modify 작성자")).andReturn());
	}
	

	@Test
	public void testDel() throws Exception {
		log.info(mc.perform(
				MockMvcRequestBuilders.post("/board/del")
				.param("bnum", "121")).andReturn());
	}
}
