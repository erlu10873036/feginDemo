package com.spring.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.demo.model.Plus;
import com.spring.demo.model.Result;
import com.spring.demo.service.impl.TestServiceDemoHystrix;

/**
 * @author: wangshao
 * @date:2019年3月12日 上午1:36:42
 * @version :
 * 
 */
@FeignClient(value = "testdemoservice", fallback = TestServiceDemoHystrix.class)
public interface TestDemoService {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	String indexService();

	@RequestMapping(value = "/plusdemo", method = RequestMethod.GET)
	Result plusService(@RequestParam(name = "numA") int numA, @RequestParam(name = "numB") int numB);

	@RequestMapping(value = "/plusdemo", method = RequestMethod.POST, consumes = "application/json")
	Result plusabService(Plus plus);

	@RequestMapping(value = "/plusdemo2", method = RequestMethod.POST)
	Result plus2Service(@RequestBody Plus plus);

}
