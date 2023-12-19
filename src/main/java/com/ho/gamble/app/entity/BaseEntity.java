package com.ho.gamble.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@EntityListeners(AuditingEntityListener.class)
@Getter
@MappedSuperclass
public class BaseEntity {
  @CreatedBy
  @Column(nullable = false)
  private Long createdBy;

  @CreatedDate
  private LocalDateTime createdDate;

  @LastModifiedBy
  @Column(nullable = false)
  private Long updatedBy;

  @LastModifiedDate
  private LocalDateTime updatedDate;

  @Column(nullable = false)
  private boolean deleted = false;

  @Embeddable
  public static class Address {
    private String zipCode;
    private String address1;
    private String address2;
  }
}
