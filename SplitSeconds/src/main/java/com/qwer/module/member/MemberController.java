package com.qwer.module.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class MemberController {
	@Autowired
	MemberService memberService;

	
	
	@RequestMapping(value = "MemberService memberService;")
	public String memberList(@ModelAttribute("vo") MemberVo vo , Model model) {
		
		vo.setParamsPaging(memberService.selectOneCount());
	
//		int a = codeGroupService.selectOneCount();
		model.addAttribute("list",memberService.selectList(vo));
//		model.addAttribute("vo",vo);
		
		return "/xdm/member/MemberXdmList";
	}
//	
//	@RequestMapping(value = "/xdm/member/MemberXdmForm")
//	public String MemberXdmForm(MemberVo codeGroupVo , Model model) { 
//		model.addAttribute("list",memberService.selectListForMemberSelect(MemberVo));
//		return "/xdm/member/MemberXdmForm";
//	}
	@RequestMapping(value = "/member/MemberXdmInst")
	public String memberInst(MemberDto memberDto) {
		
		memberService.insert(memberDto);
		return "redirect:/xdm/member/MemberXdmList";
	}
	
}
