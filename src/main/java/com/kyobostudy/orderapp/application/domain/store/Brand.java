package com.kyobostudy.orderapp.application.domain.store;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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

    @JoinColumn(foreignKey = @ForeignKey(name = "FK_FRANCHISE_ID", value = ConstraintMode.CONSTRAINT))
    @ManyToOne()
    private Franchise franchise;

    @Column(name = "customer_service_number")
    private String customerServiceNumber;
}
