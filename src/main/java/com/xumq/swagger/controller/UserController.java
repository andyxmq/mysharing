/**
 * 
 */
package com.xumq.swagger.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xumq
 *
 */
@Controller
@RequestMapping("/test")
public class UserController {

	@RequestMapping("/index")
	public String toIndex(HttpServletRequest request,Model model){  
        return "index";  
	}      
}
