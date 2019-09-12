package com.spring.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.demo.model.Plus;
import com.spring.demo.service.TestDemoService;

/**
 * @author: wangshao
 * @date:2019年3月12日 上午1:37:41
 * @version :
 * 
 */
@RestController
@RequestMapping("demo2")
public class TestController2 {

	@Autowired
	private TestDemoService testDemoService;

	@RequestMapping("/")
	public Object index() {
		return "TestDemoService feign client";
	}

	@RequestMapping("/ti")
	public Object ti() {
		return testDemoService.indexService();
	}

	@RequestMapping("/plusdemo")
	public Object plusdemo(@RequestParam("numc") int numC, @RequestParam("numd") int numD) {
		return testDemoService.plusService(numC, numD);
	}

	@RequestMapping("/plusabdemo")
	public Object plusAdemo(@RequestParam("numc") int numC, @RequestParam("numd") int numD) {
		Plus plus = new Plus();
		plus.setNumA(numC);
		plus.setNumB(numD);
		return testDemoService.plusabService(plus);
	}

	@RequestMapping("/plusdemo2")
	public Object plus2demo(Plus plus) {
		return testDemoService.plus2Service(plus);
	}

}