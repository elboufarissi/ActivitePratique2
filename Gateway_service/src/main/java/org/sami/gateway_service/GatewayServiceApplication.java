package org.sami.gateway_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatewayServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayServiceApplication.class, args);
    }

//
//    @Bean
//    RouteLocator gatewayRoutes(RouteLocatorBuilder builder){
//
//        return builder.routes()
//
//                .route(r->r.path("/customers/**").uri("http://localhost:8081/"))
//                .route(r->r.path("/products/**").uri("http://localhost:8082/"))
//                .build();

//    }


    //static routing by using discovery service (EUREKA)
   // @Bean
    RouteLocator gatewayRoutes(RouteLocatorBuilder builder){

        return builder.routes()

                .route(r->r.path("/custumers/**").uri("lb://CUSTUMER-SERVICE") )
                .route(r->r.path("/products/**").uri("lb://INVENTORY-SERVICE") )
                .build();

    }
    @Bean
    DiscoveryClientRouteDefinitionLocator dynamicRoutes(ReactiveDiscoveryClient rdc,
                                                        DiscoveryLocatorProperties dlp){

        return new DiscoveryClientRouteDefinitionLocator(rdc,dlp);

    }
}
