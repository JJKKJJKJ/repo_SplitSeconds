package com.qwer.module.codeGroup;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface CodeGroupDao {
	

	public List<CodeGroupDto> selectList(); 
	public CodeGroupDto selectOne(CodeGroupDto codegroupDto); 
	public int insert(CodeGroupDto codegroupDto); 
	
}
