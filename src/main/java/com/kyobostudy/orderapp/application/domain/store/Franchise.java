package com.kyobostudy.orderapp.application.domain.store;

import com.kyobostudy.orderapp.application.domain.common.BaseEntity;
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
public class Franchise extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long franchiseId;

    private String franchiseName;

//    @OneToMany(mappedBy = "brand")
//    private List<Store> stores;

    // 대표이름
    // 사업자번호
    // 주소
    @Column(name = "customer_service_number")
    private String customerServiceNumber;
}
