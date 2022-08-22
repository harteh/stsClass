package co.bm.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.bm.domain.MemberVO;

@Repository
public class MemberDAO implements MemMapper {
	
	@Autowired
	SqlSession sqlSession;

	@Override
	public List<MemberVO> getMemList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberVO getMem(long user_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void joinMem(MemberVO mvo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MemberVO login(MemberVO member) {
		// TODO Auto-generated method stub
		return null;
	}

}
