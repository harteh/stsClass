package co.bm.mapper;

import co.bm.domain.MemberVO;

public interface MemMapper {
	//회원가입
	public void joinMem(MemberVO member);
	
	//id로 회원정보 가져오기
	public MemberVO getMemById(MemberVO member);
}
