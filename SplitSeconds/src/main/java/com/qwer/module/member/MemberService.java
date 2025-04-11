package com.qwer.module.member ;

import java.util.ArrayList;
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
	
	public MemberDto selectMember(MemberDto codeDto){
		return memberDao.selectMember(codeDto);
	}
	public int insert(MemberDto codeDto){
		return memberDao.insert(codeDto);
	}
	
	public int selectOneCount(){
		return memberDao.selectOneCount();
	}
 
	
}
