package com.spring.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.demo.model.Plus;
import com.spring.demo.service.TestService;

/**
 * @author: wangshao1
 * @date:2019年3月12日 上午1:37:41
 * @version :
 * 
 */
@RestController
@RequestMapping("demo1")
public class TestController {

	@Autowired
	private TestService testService;

	@RequestMapping("/")
	public Object index() {
		return "feign client";
	}

	@RequestMapping("/ti")
	public Object ti() {
		return testService.indexService();
	}

	@RequestMapping("/plus")
	public Object plus(@RequestParam("numa") int numA, @RequestParam("numb") int numB) {
		return testService.plusService(numA, numB);
	}

	@RequestMapping("/plusab")
	public Object plusA(@RequestParam("numa") int numA, @RequestParam("numb") int numB) {
		Plus plus = new Plus();
		plus.setNumA(numA);
		plus.setNumB(numB);
		return testService.plusabService(plus);
	}

	@RequestMapping("/plus2")
	public Object plus2(Plus plus) {
		return testService.plus2Service(plus);
	}

}