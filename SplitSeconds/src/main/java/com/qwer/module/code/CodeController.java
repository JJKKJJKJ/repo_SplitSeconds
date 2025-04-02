package com.qwer.module.code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qwer.module.codeGroup.CodeGroupDto;
@Controller
public class CodeController {
	@Autowired
	CodeService codeService;
	
	
	@RequestMapping(value = "/xdm/code/CodeXdmList")
	public String codeXdmList(@ModelAttribute("vo") CodeVo vo , Model model) {
		
		vo.setParamsPaging(codeService.selectOneCount());
	
//		int a = codeGroupService.selectOneCount();
		
		model.addAttribute("list",codeService.selectList(vo));
//		model.addAttribute("vo",vo);
		
		return "xdm/code/codeXdmList";
	}
	
	@RequestMapping(value = "/xdm/code/CodeXdmForm")
	public String codegroupXdmForm( ) { 
		return "xdm/code/CodeXdmForm";
	}
	@RequestMapping(value = "/code/CodeXdmInst")
	public String codeXdmInst(CodeDto codeDto) {
		
		System.out.println("codeDto.getcdName(): " + codeDto.getCdName());
		
		codeService.insert(codeDto);
		return "redirect:/xdm/code/CodeXdmList";
	}
	
}
