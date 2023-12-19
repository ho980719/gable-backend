package com.ho.gamble.app.entity.player;

import com.ho.gamble.app.entity.BaseEntity;
import jakarta.persistence.*;

@Entity
@Table(name = "TBL_PLAYER")
public class Player extends BaseEntity {
  @Id
  @Column(name = "PLAYER_ID")
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private Long id;
  private String name;

}
