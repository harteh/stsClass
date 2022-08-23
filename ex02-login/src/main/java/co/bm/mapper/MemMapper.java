package co.bm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import co.bm.domain.MemberVO;

public interface MemMapper {
	//회원가입
	public void joinMem(MemberVO member);
	
	//id로 회원정보 가져오기
//	public MemberVO getMemById(long user_id);
	public MemberVO getMemById(MemberVO member);

	//로그인 체크
	public String loginChk(MemberVO member);
	
}
