package com.sit.softwareprocess.GreetingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GreetingService {

    @Autowired
    private GreetingRepository greetingRepository;

    public Greeting insertGreeting(Greeting greeting){
        return greetingRepository.save(greeting);
    }

    public List<Greeting> getAllGreeting(){
        return greetingRepository.findAll();
    }

    public Greeting getGreetingById(int id){
        return greetingRepository.getOne(id);
    }
}
