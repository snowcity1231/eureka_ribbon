package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/** 
* @ClassName: ConsumerController 
* @Description: TODO
* @author xuechen
* @date 2017年1月6日 下午2:57:39
*  
*/
@RestController
public class ConsumerController {

	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping("/add")
	public String add(Integer a, Integer b) {
//		return restTemplate.getForEntity("http://COMPUTE-SERVICE/add?a=" + a + "&b=" + b, String.class).getBody();
		return restTemplate.getForEntity("http://AAA-1/add?a=" + a + "&b=" + b, String.class).getBody();
	}
}
