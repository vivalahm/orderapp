package com.kyobostudy.orderapp.application.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

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

  public void setId(Long id) {
    this.id = id;
  }

  public Long getId() {
    return id;
  }
}