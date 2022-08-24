package co.bm.service;

import co.bm.domain.MemberVO;

public interface MemService {
	
	//회원가입
	MemberVO registerMem(MemberVO member);
	
	/** 
	 * 회원 1명 조회하기 ,email이 기준
	 * 로그인 시 사용됨
	 * @param member
	 * @return
	 */
	MemberVO getMemById(MemberVO member);

	
	

}
