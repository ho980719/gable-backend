package com.ho.gamble.common.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpHeaders;


@Getter
@Setter
@Builder
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseData<T> {
  private boolean success;
  private T data;
  private Error error;

  public static <T> ResponseData<T> success(T data) {
    return new ResponseData<>(true, data, null);
  }


  public static <T> ResponseData<T> successHeader(T data, HttpHeaders headers) {
    return new ResponseData<>(true, data, null);
  }

  public static <T> ResponseData<T> fail(String code, String message) {
    return new ResponseData<>(false, null, new Error(code, message));
  }

  @Getter
  @AllArgsConstructor
  static class Error {
    private String code;
    private String message;
  }
}
