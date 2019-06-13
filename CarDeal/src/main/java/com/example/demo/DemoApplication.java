package com.example.demo;

import com.example.demo.Domain.CarDeal;
import com.example.demo.Domain.CarRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


    @Bean
    public CommandLineRunner CarDeal(CarRepo repo){
        return args -> {
            //Save a couple Car
            repo.save(new CarDeal("Honda", "Civic Type-R"));
            repo.save(new CarDeal("Acura", "NSX"));
            repo.save(new CarDeal("Suburu", "WRX STi"));
            repo.save(new CarDeal("Nissan", "Skyline R34"));
            repo.save(new CarDeal("Toyota", "Supra"));
            repo.save(new CarDeal("Toyota", "Prius"));

            //Read all customer
            log.info("Customers found with findAll();");
            log.info("-------------------------------");
            for (CarDeal customer : repo.findAll()){
                log.info(customer.toString());
            }
            log.info("");

            //Read an individual customer by ID
            repo.findById(1L)
                    .ifPresent(customer -> {
                        log.info("Customer found with findbyID(1L):");
                        log.info("---------------------------------");
                        log.info(customer.toString());
                        log.info("");
                    });

        };
    }
}

