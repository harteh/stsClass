package co.bm.service;

import java.util.List;

import co.bm.domain.MemberVO;

public interface MemService {
	
	//회원가입
	Long registerMem(MemberVO member);
	
	//전체 회원 조회
	List<MemberVO> getMemList();
	
	//회원 1명 조회
	MemberVO getMem(long user_id);

}
