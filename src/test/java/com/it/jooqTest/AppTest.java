package com.it.jooqTest;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.it.jooq.generated.tables.daos.UserDao;
import com.it.jooq.generated.tables.pojos.User;


@RunWith(SpringRunner.class)
@SpringBootTest
public class AppTest 
{
	
	@Autowired UserDao userDao;
	
    public void testApp()
    {
    	User user = userDao.findById(2);
    	System.out.println(user.toString());
    }
}
