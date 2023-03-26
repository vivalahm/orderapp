package com.kyobostudy.orderapp.application.domain.store;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long brandId;

    private String brandName;

    @OneToMany(mappedBy = "brand")
    private List<Store> stores;

    @Column(name = "customer_service_number")
    private String customerServiceNumber;
}
