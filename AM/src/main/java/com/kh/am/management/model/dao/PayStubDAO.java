package com.kh.am.management.model.dao;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.am.management.model.vo.PageInfo;
import com.kh.am.management.model.vo.PayStub;
import com.kh.am.management.model.vo.Paystubplus;

@Repository
public class PayStubDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSession;


	public List<PayStub> selectList(int memberNo) {
	

		return sqlSession.selectList("paystubMapper.selectList",memberNo);
	}

	public PayStub selectone(int memberNo) {
		
		System.out.println("11111111");
		
		return sqlSession.selectOne("paystubMapper.selectone",memberNo);
	}

	public List<Paystubplus> requestlist(int memberNo) {
		
		return sqlSession.selectList("paystubMapper.requestlist",memberNo);
	}

	public Paystubplus requestone(int corrNo) {
		
		return sqlSession.selectOne("paystubMapper.requestone",corrNo);
	}

}
