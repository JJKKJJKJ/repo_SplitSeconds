package com.qwer.module.member ;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {


	@Autowired
	MemberDao memberDao;

	public List<MemberDto> selectList(MemberVo vo){
		return  memberDao.selectList(vo);
	}
	
	public MemberDto selectMember(MemberDto memberDto){
		return memberDao.selectMember(memberDto);
	}
	public int insert(MemberDto memberDto){
		return memberDao.insert(memberDto);
	}
	
	public int selectOneCount(){
		return memberDao.selectOneCount();
	}
 
}
