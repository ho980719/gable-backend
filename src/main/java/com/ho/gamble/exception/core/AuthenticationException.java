package com.ho.gamble.exception.core;

import lombok.Getter;

/**
 * 인징이 되지 않는 접근의 경우
 * Ex) JWT가 없거나 로그인이 되지 않는 경우
 */
@Getter
public class AuthenticationException extends BusinessException {
  private static final String DEF_MESSAGE = "errors.authentication";

  public AuthenticationException() {
    this(DEF_MESSAGE);
  }

  public AuthenticationException(String message) {
    super(message, (Object[]) null);
  }
}
