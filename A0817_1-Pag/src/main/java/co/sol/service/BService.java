package co.sol.service;

import java.util.List;

import co.sol.main.BVO;
import co.sol.main.Basic;

public interface BService {

	//글 추가작업
	Long submit(BVO bo);
	
	//특정 게시글 조회
	BVO get(int bnum);
	
	//글 수정
//	boolean modify(BVO bo);
	int modify(BVO bo);
	
	//글 삭제	
//	boolean del(int bnum);
	int del(int bnum);
	
	//글 전체 조회
	List<BVO> getList();
	
	
	//페이징
	List<BVO> getPage(Basic ba);
	
	
}
