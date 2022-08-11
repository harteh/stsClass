package co.sol.service;

import java.util.List;

import org.springframework.stereotype.Service;

import co.sol.main.BVO;
import co.sol.mapper.BMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

@Service
@Log4j
@RequiredArgsConstructor	//final, @Notnull을 사용한 필드에 대한 생성자를 자동으로 생성해주는 어노테이션
public class BServiceImpl implements BService{

	private final BMapper mapper;
	//BMapper를 주입받은 생성자가 만들어 진다

	//글 추가작업
	@Override
	public Long submit(BVO bo) {
		mapper.inkey(bo);
		return bo.getBnum();
	}

	//글 전체 조회
	@Override
	public List<BVO> getList() {
		return mapper.getList();
	}

	//특정 게시글 조회
	@Override
	public BVO get(int bnum) {
		return mapper.getBoardOne(bnum);
	}

	/*
	@Override
	public int modify(BVO bo) {
		return mapper.up(bo);
	}
	*/
	//글 수정
	public boolean modify(BVO bo) {
		return mapper.up(bo) == 1;
	}

	//글 삭제
	@Override
	public boolean del(int bnum) {
		return mapper.del(bnum) == 1;
		//해당 글이 있으면 1(true)를 반환하여 test 실행
	}

}
