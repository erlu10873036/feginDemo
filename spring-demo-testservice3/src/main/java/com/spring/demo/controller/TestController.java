package com.spring.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.demo.model.Plus;
import com.spring.demo.model.Result;

/**
 * @author: wangshao
 * @date:2019年3月12日 上午12:24:23
 * @version :
 * 
 */
@RestController
public class TestController {

	@Value("${spring.application.name}")
	private String serviceName;

	@Value("${app.ip}")
	private String address;

	@Value("${server.port}")
	private String port;

	@RequestMapping("/")
	public Object index() {
		Result result = new Result();
		result.setServiceName(serviceName);
		result.setHost(String.format("%s:%s", address, port));
		result.setMessage("hello");
		return result;
	}

	@RequestMapping("/plusdemo")
	public Object plus(Plus plus) {
		Result result = new Result();
		result.setServiceName(serviceName);
		result.setHost(String.format("%s:%s", address, port));
		result.setMessage("success");
		result.setContent(plus.getNumA() + plus.getNumB());
		return result;
	}

	@RequestMapping("/plusdemo2")
	public Object plus2(@RequestParam("numc") int numA, @RequestParam("numd") int numB) {
		Result result = new Result();
		result.setServiceName(serviceName);
		result.setHost(String.format("%s:%s", address, port));
		result.setMessage("success");
		result.setContent(numA + numB);
		return result;
	}

}