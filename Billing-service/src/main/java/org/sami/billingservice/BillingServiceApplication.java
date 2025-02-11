package org.sami.billingservice;

import org.sami.billingservice.Entities.Bill;
import org.sami.billingservice.Entities.ProductItem;
import org.sami.billingservice.Feign.CustumerRestClient;
import org.sami.billingservice.Feign.ProductRestClient;
import org.sami.billingservice.Models.Custumer;
import org.sami.billingservice.Repositories.BillRepo;
import org.sami.billingservice.Repositories.ProductItemRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.sql.Date;

@SpringBootApplication
@EnableFeignClients
public class BillingServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BillingServiceApplication.class, args);
    }

//    @Bean
//    CommandLineRunner start(BillRepo billRepo, ProductItemRepo productItemRepo, ProductRestClient productRestClient, CustumerRestClient custumerRestClient) {
//        return args -> {
//            Custumer custumer = custumerRestClient.findCustumerById(1L);
//            Bill bill = billRepo.save(new Bill(null, new Date(System.currentTimeMillis()), null, custumer.getId(), null));
//            productRestClient.getAllProducts().getContent().forEach(p -> {
//                productItemRepo.save(new ProductItem(null, p.getId(), null, p.getPrice(), (int) (1 + Math.random() * 1000), bill));
//            });
//        };
//  }
}




