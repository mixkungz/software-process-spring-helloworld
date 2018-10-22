package com.sit.softwareprocess.GreetingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class GreetingController {
    @Autowired
    private GreetingService greetingService;

    @RequestMapping(
            method = RequestMethod.POST,
            value = "/greetings"
    )
    public Greeting insertNewGreeting(@RequestBody Greeting greeting){
        return greetingService.insertGreeting(greeting);
    }

    @RequestMapping(
            method = RequestMethod.GET,
            value = "/greetings"
    )
    public List<Greeting> getAllGreeting(){
        return greetingService.getAllGreeting();
    }

    @RequestMapping(
            method = RequestMethod.GET,
            value = "/greetings/{greetingId}"
    )
    public Greeting getGreetingById(@PathVariable("greetingId") int id){
        return greetingService.getGreetingById(id);
    }
}
