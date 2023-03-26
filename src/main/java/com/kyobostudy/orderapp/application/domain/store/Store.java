package com.kyobostudy.orderapp.application.domain.store;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Comment;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String phone;

    @Comment("브랜드 정보, NULL일 경우 개인 사업자")
    @JoinColumn(foreignKey = @ForeignKey(name = "FK_BRAND_ID", value = ConstraintMode.NO_CONSTRAINT))
    @ManyToOne
    private Brand brand;

    @Lob
    private String description;

    @Column(nullable = false)
    private String categoryCode;

    @OneToMany(mappedBy = "store", cascade = CascadeType.ALL)
    private List<StoreHours> storeHours;

    @Column(nullable = false)
    private LocalDate openingDate;

    @Column(nullable = false)
    private double commissionRate;

    @Column(nullable = false)
    private String businessNumber;

    @Column
    private String imgWebLinkUrl;
}
