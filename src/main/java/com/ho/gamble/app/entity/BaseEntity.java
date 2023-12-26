package com.ho.gamble.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.hibernate.annotations.ColumnDefault;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;


@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity {
  @CreatedBy
  @Column(nullable = false)
  private String createdBy;

  @CreatedDate
  @ColumnDefault("CURRENT_TIMESTAMP")
  private LocalDateTime createdDateTime;

  @LastModifiedBy
  @Column(nullable = false)
  private String updatedBy;

  @LastModifiedDate
  @ColumnDefault("CURRENT_TIMESTAMP")
  private LocalDateTime updatedDateTime;

  @Column(nullable = false)
  @ColumnDefault("false")
  private boolean deleted = false;


  @Getter
  @Embeddable
  public static class Address {
    private String zipCode;
    private String address1;
    private String address2;
  }
}
