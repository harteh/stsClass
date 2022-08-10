package co.sol.test1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

@Component
@Data
public class Soldesk {
	
	//세터매서드 생성
	//Student 객체 주소값을 자동 주입
	@Setter(onMethod_=@Autowired)
	private Student stu;

}
