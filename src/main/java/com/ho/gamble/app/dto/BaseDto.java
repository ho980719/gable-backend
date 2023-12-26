package com.ho.gamble.app.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.Month;

@Getter
@Setter
public class BaseDto {
  private LocalDate searchDate1 = LocalDate.now().minusMonths(3);
  private LocalDate searchDate2 = LocalDate.now();
}
