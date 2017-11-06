package com.sky.oms.test;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.sky.oms.model.User;
import com.sky.oms.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations = { "classpath:spring.xml",  
        "classpath:spring-mybatis.xml" })  
public class TestUserService {
	 private static final Logger LOGGER = Logger  
	            .getLogger(TestUserService.class);  
	 @Autowired  
	    private UserService userService; 
	   
	    @Test  
	    public void testQueryById1() {  
	        User user = userService.getUserById(1);  
	        LOGGER.info(JSON.toJSON(user));  
	    }  
	  
	    @Test  
	    public void testQueryAll() {  
	        List<User> users = userService.getUsers();  
	        LOGGER.info(JSON.toJSON(users));  
	    }  
	  
	    @Test  
	    public void testInsert() {  
	    	User user = new User();  
	    	user.setUserName("admin");
	    	user.setCreateTime(new Date());  
	        int result = userService.insert(user);  
	        System.out.println(result);  
	    }  
}
