package com.ho.gamble.app.entity.member;

import com.ho.gamble.app.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name = "TBL_MEMBER")
@Getter
public class Member extends BaseEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "MEMBER_ID")
  private Long id;

  @Column(name = "MEMBER_NAME", length = 30, nullable = false)
  private String name;

  @Column(name = "MEMBER_NICK_NAME", length = 50)
  private String nickName;

  @Column(name = "MEMBER_LOGIN_ID", length = 50, nullable = false)
  private String loginId;

  @Column(name = "MEMBER_PASSWORD", length = 100, nullable = false)
  private String password;

  @Embedded
  @AttributeOverrides({
      @AttributeOverride(name="zipCode", column = @Column(name = "MEMBER_ZIPCODE")),
      @AttributeOverride(name="address1", column = @Column(name = "MEMBER_ADDRESS1")),
      @AttributeOverride(name="address2", column = @Column(name = "MEMBER_ADDRESS2"))
  })
  private Address address;
}
