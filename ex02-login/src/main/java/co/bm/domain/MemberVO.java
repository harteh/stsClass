package co.bm.domain;

import lombok.Data;

@Data
public class MemberVO {
	
	private Long user_id;
	private String email;
	private String nickname;
	private String password;
	private String user_name;
	private String phone;
	private String addr;
	private Long user_grade;
}
