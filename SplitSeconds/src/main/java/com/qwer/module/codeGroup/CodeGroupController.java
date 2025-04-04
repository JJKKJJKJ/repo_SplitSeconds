package com.qwer.module.codeGroup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class CodeGroupController {
	@Autowired
	CodeGroupService codeGroupService;
	
	
	@RequestMapping(value = "/xdm/codegroup/CodeGroupXdmList")
	public String codegroupXdmList(@ModelAttribute("vo") CodeGroupVo vo , Model model) {
		
		vo.setParamsPaging(codeGroupService.selectOneCount());
	
//		int a = codeGroupService.selectOneCount();
		
		model.addAttribute("list",codeGroupService.selectList(vo));
//		model.addAttribute("vo",vo);
		
		return "xdm/codegroup/codegroupXdmList";
	}
	
	@RequestMapping(value = "/xdm/codegroup/CodeGroupXdmForm")
	public String codegroupXdmForm( ) {
	
		return "xdm/codegroup/CodeGroupXdmForm";
	}
	@RequestMapping(value = "/codegroup/CodeGroupXdmInst")
	public String codegroupXdmInst(CodeGroupDto codegroupDto) {
	
		System.out.println("codegroupDto.getSeq(): " + codegroupDto.getCgseq());
	
		codeGroupService.insert(codegroupDto);
		
		System.out.println("codegroupDto.getSeq(): " + codegroupDto.getCgseq());
		return "redirect:/xdm/codegroup/CodeGroupXdmList";
	}
	
	@RequestMapping(value = "/CodeGroupXdmUpdt")
	public String codeGroupXdmUpdt(CodeGroupDto codeGroupDto) {
		codeGroupService.update(codeGroupDto);
		return "redirect:/xdm/codegroup/CodeGroupXdmList";
	}
	
	@RequestMapping(value = "/CodeGroupXdmUelt")
	public String codeGroupXdmUelt(CodeGroupDto codeGroupDto) {
		codeGroupService.uelete(codeGroupDto);
		return "redirect:/xdm/codegroup/CodeGroupXdmList";
	}
	
	@RequestMapping(value = "/CodeGroupXdmDelt")
	public String codeGroupXdmDelt(CodeGroupDto codeGroupDto) {
		codeGroupService.delete(codeGroupDto);
		return "redirect:/xdm/codegroup/CodeGroupXdmList";
	}
}
