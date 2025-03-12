package com.qwer.module.codeGroup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class CodeGroupController {
	@Autowired
	CodeGroupService codegroupServic;
	
	@RequestMapping(value = "/xdm/codegroup/CodeGroupXdmList")
	public String codegroupXdmList(Model model) {
		model.addAttribute("list",codegroupServic.selectList());
		return "xdm/codegroup/codegroupXdmList";
	}
	
	@RequestMapping(value = "/codegroup/CodeGroupXdmForm")
	public String codegroupXdmForm( ) {
	
		return "xdm/codegroup/codegroupXdmForm";
	}
	@RequestMapping(value = "/codegroup/CodeGroupXdmInst")
	public String codegroupXdmInst(CodeGroupDto codegroupDto) {
	
		System.out.println("codegroupDto.getSeq(): " + codegroupDto.getCgseq());
		 
		
		codegroupServic.insert(codegroupDto);
		
		System.out.println("codegroupDto.getSeq(): " + codegroupDto.getCgseq());
		return "redirect:/xdm/codegroup/codegroupXdmList";
	}
}
