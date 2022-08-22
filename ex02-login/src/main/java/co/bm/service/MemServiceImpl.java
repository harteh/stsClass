package co.bm.service;

import org.springframework.stereotype.Service;

import co.bm.domain.MemberVO;
import co.bm.mapper.MemMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

@Service
@Log4j
@RequiredArgsConstructor
public class MemServiceImpl implements MemService {
	
	private final MemMapper dao;

	@Override
	public MemberVO registerMem(MemberVO member) {
		// 회원 가입
		log.info("MemServiceImpl reg ------------");
		dao.joinMem(member);
		return member;
	}

	@Override
	public MemberVO getMemById(long user_id) {
		// id로 회원 정보 가져오기
		log.info("MemServiceImpl getMemById ------------");
		return dao.getMemById(user_id);
	}

}
