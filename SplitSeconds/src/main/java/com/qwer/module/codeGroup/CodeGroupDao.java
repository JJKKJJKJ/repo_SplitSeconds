package com.qwer.module.codeGroup;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface CodeGroupDao {


	public int selectOneCount();
	public List<CodeGroupDto> selectList(CodeGroupVo vo); 
	public CodeGroupDto selectOne(CodeGroupDto codegroupDto); 
	public int insert(CodeGroupDto codegroupDto); 

	
//	public int update(CodeGroupDto codeGroupDto);
//	public int uelete(CodeGroupDto codeGroupDto);
	public int delete(CodeGroupDto codeGroupDto);
	
}
