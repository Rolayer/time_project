package com.leenleda.time.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.Executors;

@SpringBootApplication
public class TimeProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(TimeProjectApplication.class, args);
        RingBufferWheel ringBufferWheel = new RingBufferWheel( Executors.newFixedThreadPool(2));
        Task job = new Job();
        job.setKey(30);
        ringBufferWheel.addTask(job);
        ringBufferWheel.cancel(1);
    }
    public static class Job extends Task{
        @Override
        public void run() {
            System.out.println("test5");
        }
    }
}
