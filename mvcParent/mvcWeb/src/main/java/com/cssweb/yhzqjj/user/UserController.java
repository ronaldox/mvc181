package com.cssweb.yhzqjj.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lsy.common.UserService;

@RestController
public class UserController {
	@Reference
	private UserService userService;
	@RequestMapping(value="/test01")
	public String selectUserList() {
		return userService.selectList();
	}
}
