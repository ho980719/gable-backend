package com.ho.gamble.exception.core;

import lombok.Getter;

/**
 * 사용자 인증이 완료된 이후 리소스 접근 권한이 없을 경우 Ex) 읽기,쓰기 또는 ROLE(관리자 또는 일반 사용자가 접근 가능한 API)에 따라
 */
@Getter
public class AuthorizationException extends BusinessException {
  private static final String DEF_MESSAGE = "errors.authorization";

  public AuthorizationException() {
    this(DEF_MESSAGE);
  }

  public AuthorizationException(final String message) {
    super(message, (Object[]) null);
  }
}
