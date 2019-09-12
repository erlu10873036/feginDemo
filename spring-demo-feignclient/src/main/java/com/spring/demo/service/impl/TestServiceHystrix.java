package com.spring.demo.service.impl;

import org.springframework.stereotype.Component;

import com.spring.demo.model.Plus;
import com.spring.demo.model.Result;
import com.spring.demo.service.TestService;

/**
 * @author: wangshao
 * @date:2019年3月12日 上午2:10:54
 * @version :
 * 
 */
@Component
public class TestServiceHystrix implements TestService {

	@Override
	public String indexService() {
		return "{\"code\": 999,\"message\": \"服务断路\"}";
	}

	@Override
	public Result plusService(int numA, int numB) {
		Result result = new Result();
		result.setCode(999);
		result.setMessage("服务断路");
		return new Result();
	}

	@Override
	public Result plusabService(Plus plus) {
		Result result = new Result();
		result.setCode(999);
		result.setMessage("服务断路");
		return new Result();
	}

	@Override
	public Result plus2Service(Plus plus) {
		Result result = new Result();
		result.setCode(999);
		result.setMessage("服务断路");
		return new Result();
	}
}
