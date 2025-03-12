package com.qwer.module.codeGroup;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface CodeGroupDao {
	

	public List<CodeGroupDto> selectList(); 
	public CodeGroupDto selectOne(CodeGroupDto clubDto); 
	public int insert(CodeGroupDto clubDto); 
	
}
