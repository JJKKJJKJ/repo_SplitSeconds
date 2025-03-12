package com.qwer.module.codeGroup;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CodeGroupService {


	@Autowired
	CodeGroupDao codeGroupDao;

	public List<CodeGroupDto> selectList(){
		return  codeGroupDao.selectList();
	}
	
	public CodeGroupDto selectOne(CodeGroupDto codegroupDto){
		return codeGroupDao.selectOne(codegroupDto);
	}
	public int insert(CodeGroupDto codegroupDto){
		return codeGroupDao.insert(codegroupDto);
	}
	
}
