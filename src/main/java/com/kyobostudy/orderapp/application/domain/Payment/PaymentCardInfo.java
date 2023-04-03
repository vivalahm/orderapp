package com.kyobostudy.orderapp.application.domain.Payment;

import com.kyobostudy.orderapp.application.domain.common.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PaymentCardInfo extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paymentCardInfoId;
    private Long userId;
    private String cardNumber;
    private LocalDate expirationDate;



}


