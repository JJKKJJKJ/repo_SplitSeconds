package com.qwer.module.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qwer.module.codeGroup.CodeGroupDto;

@Controller
public class MemberController {
	@Autowired
	MemberService memberService;
	
	@RequestMapping(value = "/xdm/member/MemberXdmList")
	public String memberList(@ModelAttribute("vo") MemberVo vo , Model model) {
		
		vo.setParamsPaging(memberService.selectOneCount(vo));
		
		if (vo.getTotalRows() > 0) {
			model.addAttribute("list", memberService.selectList(vo));
		}
	
//		int a = memberService.selectOneCount(vo);
		model.addAttribute("list", memberService.selectList(vo));
//		model.addAttribute("vo",vo);
		
		return "/xdm/member/MemberXdmList";
	}
	
	@RequestMapping(value = "/xdm/member/MemberXdmForm")
	public String MemberXdmForm(MemberVo memberVo , Model model) { 
//		model.addAttribute(memberService.selectListForMemberSelect(MemberVo));
		return "/xdm/member/MemberXdmForm";
	}
	@RequestMapping(value ="/member/MemberInst")
	public String memberInst(MemberDto memberDto) {
		
		memberService.insert(memberDto);
		return "redirect:/xdm/member/MemberXdmList";
	}
	@RequestMapping(value ="/xdm/member/MemberXdmMForm") 
	public String MemberXdmMfom(Model model , MemberDto MemberDto) {
//		model.addAttribute("item",memberService.selectOne(MemberDto)); 
		return "/xdm/member/MemberXdmMForm"; 
	 }
	 
	
	@RequestMapping(value = "/xdm/member/MemberXdmUpdt")
	public String memberXdmUpdt(MemberDto memberDto) {
		memberService.update(memberDto);
		return "redirect:/xdm/member/MemberXdmList";
	}
	
	@RequestMapping(value = "/xdm/member/MemberXdmUelt")
	public String memberXdmUelt(MemberDto memberDto) {
		memberService.uelete(memberDto);
		return "redirect:/member/MemberXdmList";
	}
	
	@RequestMapping(value = "/xdm/member/MemberXdmDelt")
	public String memberXdmDelt(MemberDto memberDto) {
		memberService.delete(memberDto);
		return "redirect:/member/MemberXdmList";
	}
	
	
}

