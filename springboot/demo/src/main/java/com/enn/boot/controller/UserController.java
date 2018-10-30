package com.enn.boot.controller;

import javax.servlet.http.HttpServletRequest;

import org.mapstruct.Context;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

/**
 * @author hanyl
 *
 */
@RestController
@RequestMapping("/hello")
public class UserController {


	/**
	 * @param userName
	 * @param request
	 * @return
	 */
	@GetMapping("/index")
	@ApiOperation(value = "测试接口", notes = "测试接口")
	public String index(@RequestParam("userName") String userName, @Context HttpServletRequest request) {
		return "OK: " + userName;
	}

}