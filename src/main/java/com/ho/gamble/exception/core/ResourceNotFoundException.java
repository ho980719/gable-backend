package com.ho.gamble.exception.core;

import lombok.Getter;

/**
 * HttpStatus.NOT_FOUND(404) 메시지 요청 정보가 없을 때 발생 Exception 으로 이 class를 상속 받아 아래와 같은 경우 구현, 단 message
 * key는 분리
 *
 * Ex) 사용자 정보 없을 때(UserNotFoundException), 게시물 정보 없을 때 등
 */
@Getter
public class ResourceNotFoundException extends BusinessException {
  private static final String DEF_MESSAGE = "errors.resource.not.found";

  public ResourceNotFoundException() {
    this(DEF_MESSAGE);
  }

  public ResourceNotFoundException(final String message) {
    super(message);
  }

  public ResourceNotFoundException(final String message, final Object... args) {
    super(message, args);
  }
}
