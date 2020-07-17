package com.javaex.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.javaex.service.BookService;
import com.javaex.vo.GuestVo;

@Controller
@RequestMapping(value="/api/guest")

public class ApiGuestbookController {
	
	@Autowired
	private BookService bookService;
	
	@ResponseBody
	@RequestMapping(value="/list")
	public List<GuestVo> list() {
		System.out.println("ApiguestBookController/list");
		
		List<GuestVo> guestbookList = bookService.list();
		
		System.out.println(guestbookList.toString());
		return guestbookList;
	}

}
