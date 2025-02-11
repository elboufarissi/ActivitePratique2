package org.sami.billingservice.Entities;

import jakarta.persistence.*;
import lombok.*;
import org.sami.billingservice.Models.Custumer;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date billingDate;

    @OneToMany(mappedBy = "bill")
    private List<ProductItem> productItems = new ArrayList<>();
    private long customerID;

    @Transient private Custumer customer;




}
