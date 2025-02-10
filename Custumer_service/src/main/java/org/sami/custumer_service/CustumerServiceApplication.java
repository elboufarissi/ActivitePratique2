package org.sami.custumer_service;

import org.sami.custumer_service.Entities.Custumer;
import org.sami.custumer_service.Repositories.CustumerRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustumerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustumerServiceApplication.class, args);
    }



@Bean
CommandLineRunner start(CustumerRepo custumerRepo) {
    return args -> {
        custumerRepo.save(new Custumer(null, "sami", "sami@sami.ma"));
        custumerRepo.save(new Custumer(null, "noamane", "noamane@sami.ma"));
        custumerRepo.save(new Custumer(null, "leila", "leila@sami.ma"));

        custumerRepo.findAll().forEach(
                 System.out::println);

    };
    }
}
