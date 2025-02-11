package org.sami.billingservice.Entities;

import jakarta.persistence.*;
import lombok.*;
import org.sami.billingservice.Models.Product;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@Builder
public class ProductItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private long productID;
    private double price;
    private double quantity;

    @ManyToOne
    private Bill bill;
    @Transient private Product product;

}
