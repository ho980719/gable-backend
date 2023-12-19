package com.ho.gamble.exception.core;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// @formatter:off
/**
 * HttpStatus.INTERNAL_SERVER_ERROR(500)
 * 메시지 비지니스 로직에서 예외를 발생할 필요 있을 때 사용하는 Exception
 */
// @formatter:on
@Getter
@Setter
@NoArgsConstructor
public class BusinessException extends RuntimeException {
  private static final String DEF_MESSAGE = "errors.business";

  private Object[] args;

  private String message = DEF_MESSAGE;

  public BusinessException(String message) {
    this.message = message;
    this.args = null;
  }

  public BusinessException(final String message, final Object... args) {
    this.message = message;
    this.args = args;
  }
}
