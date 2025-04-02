package com.qwer.module.codeGroup;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CodeGroupService {


	@Autowired
	CodeGroupDao codeGroupDao;

	public List<CodeGroupDto> selectList(CodeGroupVo vo){
		return  codeGroupDao.selectList(vo);
	}
	
	public List<CodeGroupDto> selectListForCodeSelect(CodeGroupVo vo){
		return  codeGroupDao.selectListForCodeSelect(vo);
	}
	
	public CodeGroupDto selectOne(CodeGroupDto codegroupDto){
		return codeGroupDao.selectOne(codegroupDto);
	}
	public int insert(CodeGroupDto codegroupDto){
		return codeGroupDao.insert(codegroupDto);
	}
	
	public int selectOneCount(){
		return codeGroupDao.selectOneCount();
	}
//	public int update(CodeGroupDto codeGroupDto) {
//		return codeGroupDao.update(codeGroupDto);
//	}
//	
//	public int uelete(CodeGroupDto codeGroupDto) {
//		return codeGroupDao.uelete(codeGroupDto);
//	}
//	
//	public int delete(CodeGroupDto codeGroupDto) {
//		return codeGroupDao.delete(codeGroupDto);
//	}
	
}
