package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    TaskRepository repository;

    @Override
    public void run(String... strings) throws Exception{
        Task task;
        task = new Task("Laundry", "10/1/2019", 1);
        repository.save(task);
        task = new Task("Cooking", "10/1/2019", 2);
        repository.save(task);
        task = new Task("Cleaning", "10/1/2019", 3);
        repository.save(task);
    }

}
