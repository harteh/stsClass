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
	
	//@Autowired
	private final MemMapper mapper;

	@Override
	public Long registerMem(MemberVO member) {
		// 회원가입
		log.info("registerMem-------" + member);
		mapper.joinMem(member);
		return member.getUser_id();
	}

	@Override
	public List<MemberVO> getMemList() {
		// 전체 회원 조회
		return mapper.getMemList();
	}

	@Override
	public MemberVO getMem(long user_id) {
		// 1명 회원 조회
		return mapper.getMem(user_id);
	}


}
