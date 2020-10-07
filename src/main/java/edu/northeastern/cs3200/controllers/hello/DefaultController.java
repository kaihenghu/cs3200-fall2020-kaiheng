package edu.northeastern.cs3200.controllers.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DefaultController {
    //	redirect default page to index.html
	//  the default page is working on local http://localhost:8080 but
	//  when WAR file was deployed on AWS the index.html is not loaded when enter 
	//  http://cs3200-fall2020-kaiheng.us-east-2.elasticbeanstalk.com/
	//  this is a way to set a default page
	@RequestMapping("/")
	   public String hello(){
	       return "forward:index.html";
	}
}
