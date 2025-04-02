package com.qwer.module.code;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface CodeDao {


	public int selectOneCount();
	public List<CodeDto> selectList(CodeVo vo); 
	public CodeDto selectOne(CodeDto codeDto); 
	public int insert(CodeDto codeDto); 

	
	
}
