package co.bm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import co.bm.domain.MemberVO;
import co.bm.mapper.MemMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

@Service
@Log4j
@RequiredArgsConstructor
public class MemServiceImpl implements MemService {
	
	private final MemMapper mapper;

	@Override
	public MemberVO registerMem(MemberVO member) {
		// 회원 가입
		log.info("MemServiceImpl reg ------------");
		mapper.joinMem(member);
		return member;
	}

	@Override
	public MemberVO getMemById(MemberVO member) {
		// id로 회원 정보 가져오기
		log.info("MemServiceImpl getMemById ------------");
		
		return mapper.getMemById(member);
//		return mapper.getMemById(user_id);
	}


	@Override
	public String loginChk(MemberVO member) {
		// 로그인
		String user_id = mapper.loginChk(member);
		return user_id;
	}

	


}
