package co.bm.dao;

import java.util.List;

import co.bm.domain.MemberVO;

public interface MemMapper {
	
	//회원 전체 목록 조회
	//MemMapperTests 테스트 용으로 @Select 사용해봄
	//@Select("select * from ex1_User")
	public List<MemberVO> getMemList();
	
	//1명 회원 정보 조회
	public MemberVO getMem(long user_id);
	
	
	//회원가입
	public void joinMem(MemberVO mvo);
	
	//로그인
	public MemberVO login(MemberVO member);

}
