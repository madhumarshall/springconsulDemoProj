package com.spring.consul.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
//@PropertySource(value={"classpath:application.properties"})
public class DataRequestEx {
	
    @Value("${madhu.mac}")
	public String myName;
    
    @Value("${Indian.Cities}")
	public String cities;
    
   /* @Value("${foo}")
    public String msg;*/
	
	
	@RequestMapping(value="/myName",method=RequestMethod.GET,headers="Accept=application/json")
	@ResponseBody
	public String capitals(){
		
		return myName+cities;
	}
	
	
		
		
		

}
