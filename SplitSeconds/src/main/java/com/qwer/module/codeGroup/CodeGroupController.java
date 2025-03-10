package com.qwer.module.codeGroup;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class CodeGroupController {

	@RequestMapping(value = "/codegroup/CodeGroupXdmList")
	public String codegroupXdmList( ) {
		
		return "xdm/codegroup/CodeGroupXdmList";
	}
}
