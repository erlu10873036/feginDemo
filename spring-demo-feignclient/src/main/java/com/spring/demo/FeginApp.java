package com.spring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author: wangshao
 * @date:2019年3月12日 上午1:32:41
 * @version :
 * 
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class FeginApp {

	public static void main(String[] args) {
		SpringApplication.run(FeginApp.class, args);
	}
}