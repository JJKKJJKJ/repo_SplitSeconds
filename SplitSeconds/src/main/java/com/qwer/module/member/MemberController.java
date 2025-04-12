package com.qwer.module.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qwer.module.code.CodeDto;
import com.qwer.module.codeGroup.CodeGroupVo;
@Controller
public class MemberController {
	@Autowired
	MemberService memberService;
	
	
	@RequestMapping(value = "/xdm/member/MemberXdmList")
	public String MemberXdmList(@ModelAttribute("vo") MemberVo vo , Model model) {
//		
//		vo.setParamsPaging(memberService.selectOneCount());
//	
//		model.addAttribute("list",memberService.selectList(vo));

		
		return "/xdm/member/MemberXdmList";
	}
	
	
	
//	@RequestMapping(value = "/xdm/member/MemberXdmForm")
//	public String codegroupXdmForm(CodeGroupVo codeGroupVo , Model model) { 
//		model.addAttribute("list",codeGroupService.selectListForCodeSelect(codeGroupVo));
//		return "xdm/member/MemberXdmForm";
////	}
//	@RequestMapping(value = "/member/MemberXdmInst")
//	public String memberXdmInst(MemberDto memberDto) 
//		
//		memberService.insert();
//		return "redirect:/member/MemberXdmList";
//	}
	
}
