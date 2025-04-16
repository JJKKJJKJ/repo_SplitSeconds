package com.qwer.module.member;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.qwer.module.codeGroup.CodeGroupDto;

@Repository
public interface MemberDao {


	public int selectOneCount(MemberVo vo);
	public List<MemberDto> selectList(MemberVo vo); 
	public List<MemberDto> selectListForCodeSelect(MemberVo vo); 
	public MemberDto selectOne(MemberDto memberDto); 
	public int insert(MemberDto memberDto); 

	public int update(MemberDto memberDto);
	public int uelete(MemberDto memberDto);
	public int delete(MemberDto memberDto);
	
}
