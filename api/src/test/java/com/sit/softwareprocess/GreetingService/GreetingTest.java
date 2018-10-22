package com.sit.softwareprocess.GreetingService;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GreetingTest {
    @Autowired
    GreetingService greetingService;

    @Test
    @Transactional
    public void greetingFirstIdMustHasTextHelloWorld(){
        Greeting greeting = greetingService.getGreetingById(1);
        Assert.assertEquals(greeting.getText(),"HelloWorld");
    }
}
