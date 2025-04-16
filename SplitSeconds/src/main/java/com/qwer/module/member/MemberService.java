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
	public List<MemberDto> selectListForCodeSelect(MemberVo vo){
		return  memberDao.selectListForCodeSelect(vo);
	}
	
	public MemberDto selectOne(MemberDto memberDto){
		return memberDao.selectOne(memberDto);
	}
	public int insert(MemberDto memberDto){
		return memberDao.insert(memberDto);
	}
	
	public int selectOneCount(MemberVo vo){
		return memberDao.selectOneCount(vo);
	}

	public int update(MemberDto memberDto){
		return memberDao.update(memberDto);
	}
	public int uelete(MemberDto memberDto){
		return memberDao.uelete(memberDto);
	}
	public int delete(MemberDto memberDto){
		return memberDao.delete(memberDto);
	}
 
}
