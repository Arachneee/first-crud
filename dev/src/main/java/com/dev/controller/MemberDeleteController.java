package com.dev.controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import com.dev.service.MemberService;

public class MemberDeleteController implements Controller{
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");

		MemberService service = MemberService.getInstance();
		service.memberDelete(id);
		
		request.setAttribute("id",id);
		HttpUtil.forward(request, response, "/result/memberDeleteOutput.jsp");
	}
	

}