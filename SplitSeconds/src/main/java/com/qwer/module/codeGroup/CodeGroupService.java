package com.qwer.module.codeGroup;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CodeGroupService {

//	로직을 정의 하는 부분
	
//	여러건의 데이터를 가지고온다
	
	@Autowired
	CodeGroupDao clubDao;
//	ClubDao clubDao = new ClubDao();
//	
//	public List<ClubDto> selectList(){
//		List<ClubDto>  clubDtos = new ArrayList<>();
//		
//		clubDtos = clubDao.selectList();
//		
//		return clubDtos;
//	}
	public List<CodeGroupDto> selectList(){
		return  clubDao.selectList();
	}
	
	public CodeGroupDto selectOne(CodeGroupDto clubDto){
		return clubDao.selectOne(clubDto);
	}
	public int insert(CodeGroupDto clubDto){
		return clubDao.insert(clubDto);
	}
	
}
