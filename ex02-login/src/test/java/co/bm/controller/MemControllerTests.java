package co.bm.controller;

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
@WebAppConfiguration
@ContextConfiguration({
	"file:src/main/webapp/WEB-INF/spring/root-context.xml",
	"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"
})
@Log4j
public class MemControllerTests {
	
	@Setter(onMethod_= {@Autowired})
	private WebApplicationContext ctx;
	
	private MockMvc mockMvc;
	
	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();
	}
	
	//회원가입 테스트
	@Test
	public void testRegister() throws Exception {
		String resultMem = mockMvc.perform(MockMvcRequestBuilders.post("/member/joinProc")
				.param("email", "tete3@naver.com")
				.param("nickname", "테스트유저3")
				.param("password", "1111")
				.param("user_name", "test33")
				.param("phone", "010-0002-0032")
				.param("addr", "서울시 중구 33")
				).andReturn().getModelAndView().getViewName();

		log.info(resultMem);
	}
	
	//로그인 테스트
	@Test
	public void testLoginProc() throws Exception {
		String resultMem = mockMvc.perform(MockMvcRequestBuilders.post("/member/loginProc")
				.param("email", "test1@naver.com")
				.param("password", "1111")
				).andReturn().getModelAndView().getViewName();

		log.info(resultMem);
	}
	
	//중복 메일 확인 테스트
	@Test
	public void testMailChk() throws Exception {
		String resultMem = mockMvc.perform(MockMvcRequestBuilders.get("/member/mailChk")
				.param("email", "test1@naver.com")
				).andReturn().getModelAndView().getViewName();

		log.info(resultMem);
	}

}
