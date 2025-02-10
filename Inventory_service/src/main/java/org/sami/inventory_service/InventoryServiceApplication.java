package org.sami.inventory_service;

import org.sami.inventory_service.Entities.Product;
import org.sami.inventory_service.Repositories.Productrepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }



    @Bean
    CommandLineRunner start(Productrepo productrepo) {
        return args -> {
            productrepo.save(new Product(null, "HP 878", 900));
            productrepo.save(new Product(null, "HP 876", 800));
            productrepo.save(new Product(null, "HP 875", 700));


            productrepo.findAll().forEach(
                     System.out::println);

        };
    }
}
