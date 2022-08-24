package co.bm.mapper;

import co.bm.domain.MemberVO;

public interface MemMapper {
	/**
	 * 회원가입: selectKey 사용 
	 * @param member
	 */
	public void joinMem(MemberVO member);
	
	/**
	 * 회원가입: 일반 insert문 사용 
	 * @param member
	 */
	public void addMem(MemberVO member);
	
	//회원 1명 정보 가져오기
	public MemberVO getMemById(MemberVO member);

}
