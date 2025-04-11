package com.qwer.module.member;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface MemberDao {


	public int selectOneCount();
	public List<MemberDto> selectList(MemberVo vo); 
	public MemberDto selectMember(MemberDto memberDto); 
	public int insert(MemberDto memberDto); 

	
	
}
