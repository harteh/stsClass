package co.sol.mapper;

import java.util.List;

import co.sol.main.BVO;

public interface BMapper {

	//전체 조회
	public List<BVO> getList();
	//조회
	public BVO getBoardOne(int bnum);
	//입력
	public void insert(BVO vo);
	//수정
	public int up(BVO vo);
	//삭제
	public int del(int bnum);
	
}
