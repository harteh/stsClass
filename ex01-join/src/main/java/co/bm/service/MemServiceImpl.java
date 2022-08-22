package co.bm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import co.bm.dao.MemberDAO;
import co.bm.domain.MemberVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

@Service
@Log4j
@RequiredArgsConstructor
public class MemServiceImpl implements MemService {
	
	//@Autowired
	private final MemberDAO dao;

	@Override
	public Long registerMem(MemberVO member) {
		// 회원가입
		log.info("registerMem-------" + member);
		dao.joinMem(member);
		return member.getUser_id();
	}

	@Override
	public List<MemberVO> getMemList() {
		// 전체 회원 조회
		return dao.getMemList();
	}

	@Override
	public MemberVO getMem(long user_id) {
		// 1명 회원 조회
		return dao.getMem(user_id);
	}

	@Override
	public MemberVO login(long user_id, String password) {
		// 로그인, 아이디와 비밀번호 확인
		// 로그인 실패 시 return null
		return null;
	}
	
	


}
