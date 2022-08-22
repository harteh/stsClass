package co.bm.service;

import co.bm.domain.MemberVO;

public interface MemService {
	
	//회원가입
	MemberVO registerMem(MemberVO member);
	
	//id로 회원 조회하기
	MemberVO getMemById(long user_id);

}
