package com.kyobostudy.orderapp.application.domain.Order;

import com.kyobostudy.orderapp.application.domain.common.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Order extends BaseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long OrderId;

  private String customerName;

  private String customerEmail;

  private String productName;

  private int quantity;


  public Order(String customerName, String customerEmail, String productName, int quantity) {
    this.customerName = customerName;
    this.customerEmail = customerEmail;
    this.productName = productName;
    this.quantity = quantity;
  }

}