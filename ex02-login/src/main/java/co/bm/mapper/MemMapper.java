package co.bm.mapper;

import co.bm.domain.MemberVO;

public interface MemMapper {
	//회원가입 selectKey 사용
	public void joinMem(MemberVO member);
	//회원가입 일반
	public void addMem(MemberVO member);
	
	//id로 회원정보 가져오기
	public MemberVO getMemById(MemberVO member);

	//로그인 체크
	public String loginChk(MemberVO member);
	
}
