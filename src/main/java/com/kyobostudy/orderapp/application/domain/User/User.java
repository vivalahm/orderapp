package com.kyobostudy.orderapp.application.domain.User;

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
public class User extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String username;
    private String password;
    private String email;
    private String phoneNumber;
    private String address;
    private String role;  // 사용자 권한 (일반 사용자, 매장 관리자, 시스템 관리자)
    private Long storeId;
}
